package wheelSimulator;

import com.trolltech.qt.gui.*;
import java.io.*;
import com.trolltech.qt.core.QPointF;
import com.trolltech.qt.core.QRect;
import com.trolltech.qt.core.QTimer;

import java.util.concurrent.*;
import java.util.*;
public class playCars extends QWidget {

	// Añadir bonificaciones mientras se avanza //
    Ui_playCars ui = new Ui_playCars();
    private QGraphicsScene scene;
    private ConcurrentHashMap<QGraphicsPixmapItem,Integer> policeCars;
    private ConcurrentHashMap<QGraphicsPixmapItem,Integer> money;
    private QGraphicsPixmapItem myCar;  
    private Object wsim;
    private QLabel labelLengthMax,labelmaxSpeed,labelactSpeed,labelTraveled,labelColisions,labelMaxColisions,labelCoins;
    private QTimer clock;
    private int actCars;
    private int traveled;
    private int maxCars;
    private int numCoins;
    private int actMoney;
    private int numColisions;
    private int maxColisions;
    private int lengthMax;
    private final int maxSpeed = 120;
    private final int maxY = 130; 
    
    public static void main(String[] args) {
        QApplication.initialize(args);

        playCars testplayCars = new playCars(null,null);
        testplayCars.show();

        QApplication.exec();
    }

    public playCars() {
        ui.setupUi(this);   
    }

    public playCars(QWidget parent,wheelSimulator e) {
        super(parent);
        ui.setupUi(this);
        this.setMinimumSize(400,150);
        this.setMinimumSize(400,150);
        this.maxColisions = conf.maxColisiones <= 20 ? conf.maxColisiones : 20;
        this.lengthMax = conf.longTrazado <= 30000 ? conf.longTrazado : 30000;
        this.wsim = e;
        policeCars = new ConcurrentHashMap<QGraphicsPixmapItem,Integer>();
        money = new ConcurrentHashMap<QGraphicsPixmapItem,Integer>();
        clock = new QTimer(this);
        clock.start(100);
        actCars = 0;
        traveled = 0;
        maxCars = 0;
        numCoins = 0;
        actMoney = 0;
        numColisions = 0;
        this.setGraphicsView();
        this.setConnects();
        this.setMyCar();
        this.setInformation();
    }
    
    private void setInformation(){
    	labelLengthMax = new QLabel(this);
    	labelLengthMax.setText("  ·Circuit Length: " + this.lengthMax + "Km");
    	labelLengthMax.setGeometry(0,77,130,13);
    	labelmaxSpeed = new QLabel(this);
    	labelmaxSpeed.setText("  ·Max speed:" + ((wheelSimulator)wsim).getMaxSpeed() + "Km/h");	
    	labelactSpeed = new QLabel(this);
    	labelactSpeed.setText("  ·Speed: " + ((wheelSimulator)wsim).getSpeed());
    	labelactSpeed.setGeometry(0,13,100,13);
        labelTraveled = new QLabel(this);
        labelTraveled.setText("  ·Traveled: " + traveled + "Km");
        labelTraveled.setGeometry(0,26,100,13);
        labelCoins = new QLabel(this);
        labelCoins.setText("  ·Coins: " + numCoins);
        labelCoins.setGeometry(0,39,100,13);
        labelMaxColisions = new QLabel(this);
        labelMaxColisions.setText("  ·Max Colisions: " + ((wheelSimulator)wsim).getMaxColisions());
        labelMaxColisions.setGeometry(0,52,100,13);
        labelColisions = new QLabel(this);
        labelColisions.setText("  ·Colisions: " + numColisions);
        labelColisions.setGeometry(0,65,100,13);
    	scene.addWidget(labelmaxSpeed);
    	scene.addWidget(labelactSpeed);
    	scene.addWidget(labelTraveled);
    }
    
    public void actLabelSpeed(String text){
    	this.labelactSpeed.setText(text);
    }
    
    public QGraphicsPixmapItem getMyCar(){
    	return myCar;
    }
    
    private void setMyCar(){
        myCar = scene.addPixmap(new QPixmap(conf.pathMyCar).scaled(30,30));
        myCar.moveBy(0,170);
    }
    
    private void setGraphicsView(){
    	ui.graphicsView = new QGraphicsView(this);
    	ui.graphicsView.setGeometry(new QRect(0,0,400,290));
        scene = new QGraphicsScene(this);
        ui.graphicsView.setScene(scene);
        // Background
        QGraphicsPixmapItem bg = scene.addPixmap(new QPixmap("classpath:icons/background3.png").scaled(398,287));
        bg.setPos(-200,0);
    }
    
    private void setConnects(){
    	clock.timeout.connect(this,"manageCars()");
    }
    
    // Formato: nombre,recorrido,colisiones,monedas //
    // Mejor puntuación dependiente de las monedas, el resto informativo //
    private void finishGame(){
    	// Comprobar si la nueva puntuación es record //
    	QMessageBox.about(this,"Fin","Game Over");
    	try{
    		FileReader fr = new FileReader(conf.pathRecords);
    		BufferedReader bfd = new BufferedReader(fr);
    		String line,antLine = null;
    		if((line = bfd.readLine())==null){
    			saveRecord svr = new saveRecord(null,traveled,numColisions,numCoins);
		    	svr.show();	
    		}
    		else{
    			// Arreglar haciendo: encontrar máximo, ver si las monedas actuales > máximo.
    			do{
    				String splitted[] = line.split(",");
    				if(numCoins > Integer.parseInt(splitted[splitted.length-1])){
    					// Diálogo modal //
    					saveRecord svr = new saveRecord(null,traveled,numColisions,numCoins);
    					svr.show();	
    				}
    			}while((line = bfd.readLine())!=null);
    		bfd.close();
    		fr.close();
    	}
    	}catch(FileNotFoundException e){ QMessageBox.about(this,"Archivo records no encontrado","Si quieres guardar tus records, configura en el menú Ajustes el path de un archivo .txt para salvar los records");}
    	catch(IOException e){ System.out.println(e.getMessage()); }
    	finally{
        	clock.timeout.disconnect();
        	((wheelSimulator)wsim).getRadio().actSound.stop();
        	((wheelSimulator)wsim).close();
    		this.close();
    	}
    }
    

    private void manageCars() throws Exception{
    	// Si la ventana se ha cerrado se para todo
    	try{
    		if(!this.isVisible()){
    			clock.timeout.disconnect();
    			((wheelSimulator)wsim).getRadio().actSound.stop();
    			((wheelSimulator)wsim).close();
    			this.close();
    		}
    		// Si no
    		this.labelTraveled.setText("  ·Traveled: " + traveled + "Km");
    		// Los coches se incrementan cada longitud trazado/2^4, trazado/2^3, trazado/2^2, trazado/2,trazado
    		// Máximo 5 coches, no configurable, se complica demasiado.
    		if(traveled <= lengthMax/16) maxCars = 1;
    		else if(traveled <= this.lengthMax/8) maxCars = 2;
    		else if(traveled <= this.lengthMax/4) maxCars = 3;
    		else if(traveled <= this.lengthMax/2) maxCars = 4;
    		else if(traveled <= this.lengthMax) maxCars = 5;
    		else {
    			if(((wheelSimulator)wsim).getRadio()!=null && ((wheelSimulator)wsim).getRadio().actSound != null) ((wheelSimulator)wsim).getRadio().actSound.stop();
    			this.finishGame();   		
    		}
    		if(numColisions >= conf.maxColisiones){
    			if(((wheelSimulator)wsim).getRadio()!=null && ((wheelSimulator)wsim).getRadio().actSound != null) ((wheelSimulator)wsim).getRadio().actSound.stop();
    			this.finishGame();
    		}
    	
    		double fVariation = (maxSpeed - ((wheelSimulator)wsim).getSpeed());
    		int sleep = (int)(fVariation)*10;
    		clock.setInterval(sleep);
    		QGraphicsPixmapItem aux;
    		for(int i=0;actCars<maxCars && i<maxCars;i++){
    			aux = scene.addPixmap(new QPixmap(conf.pathPoliceCar).scaled(40,40));
    			policeCars.put(aux,0);
    			actCars += 1;
    		}
    		this.manageMoney();
    		this.refreshCars();
    	}catch(Exception e){}
    }
    private void manageMoney() throws Exception{
    	if(actMoney==0){
    		if(Math.random()*traveled >= traveled/2){
    			QGraphicsPixmapItem aux = scene.addPixmap(new QPixmap(conf.pathMoney).scaled(20,20));
    			money.put(aux, 0);
    			actMoney += 1;
    		}
    	}
    	this.refreshMoney();
    }
    
    private void refreshMoney() throws Exception{
    	Iterator it = money.entrySet().iterator();
    	QPointF myCarPos = myCar.pos();
    	while(it.hasNext()){
    		Map.Entry<QGraphicsPixmapItem,Integer> e = (Map.Entry)it.next();
    		QPointF actCoinPos = e.getKey().pos();
    		if(e.getValue()<maxY){
    			double random = Math.random()*10;
    			if((int)random<=5) e.getKey().moveBy(-(Math.random()*35),25);
    			else e.getKey().moveBy(Math.random()*15,20);			
    			money.put(e.getKey(), e.getValue()+20);
    			// Colisiones //
    			// Se coge la posición del GRPixmap actual //
        		// Check y alignment //
        		if(actCoinPos.y()+20 >= myCarPos.y() && actCoinPos.y()+20 <= myCarPos.y()+30){
        			// Check x colision //
        			if(actCoinPos.x()+20 >= myCarPos.x() && actCoinPos.x()+20 <= myCarPos.x()+30){
        				numCoins += 1;
            			labelCoins.setText("  ·Coins: " + numCoins);
        			}
        		}
    		}
    		else{
    			QGraphicsPixmapItem aux = e.getKey();
    			if(actCoinPos.x()+20 >= myCarPos.x() && actCoinPos.x()+20 <= myCarPos.x()+30){
    				// Sonido coger moneda
    				numCoins += 1;
        			labelCoins.setText("  ·Coins: " + numCoins);
    			}
    			money.remove(e.getKey());
    			scene.removeItem(e.getKey());
    			actMoney = 0;
    		}
    	}
    }
    
    private void refreshCars() throws Exception{
    	Iterator it = policeCars.entrySet().iterator();
    	QPointF myCarPos = myCar.pos();
    	while(it.hasNext()){
    		Map.Entry<QGraphicsPixmapItem,Integer> e = (Map.Entry)it.next();
    		QPointF actCoinPos = e.getKey().pos();
    		if(e.getValue()<maxY){
    			double random = Math.random()*10;
    			if((int)random<=5) e.getKey().moveBy(-(Math.random()*35),25);
    			else e.getKey().moveBy(Math.random()*15,20);			
    			policeCars.put(e.getKey(), e.getValue()+20);
    			// Colisiones //
    			// Se coge la posición del GRPixmap actual //
        		// Check y alignment //
        		if(actCoinPos.y()+40 >= myCarPos.y() && actCoinPos.y()+40 <= myCarPos.y()+30){
        			// Check x colision //
        			if(actCoinPos.x()+40 >= myCarPos.x() && actCoinPos.x()+40 <= myCarPos.x()+30){
        				// Sonido chocar policia
        				numColisions += 1;
            			labelColisions.setText("  ·Colisions: " + numColisions);
        			}
        		}
    			
    		}
    		else{
    			QGraphicsPixmapItem aux = e.getKey();
    			if(actCoinPos.x()+30 >= myCarPos.x() && actCoinPos.x()+30 <= myCarPos.x()+30){
    				numColisions += 1;
        			labelColisions.setText("  ·Colisions: " + numColisions);
    			}
    			policeCars.remove(e.getKey());
    			aux.setVisible(false);
    			actCars -= 1;
    		}
    	}
    	traveled += 5;
    }

}

