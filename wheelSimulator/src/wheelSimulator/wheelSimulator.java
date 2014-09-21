package wheelSimulator;

import com.trolltech.qt.core.QRect;
import com.trolltech.qt.gui.*;

public class wheelSimulator extends QMainWindow {

    protected Ui_wheelSimulator ui = new Ui_wheelSimulator();
    protected int maxGir;
    protected QGraphicsPixmapItem wheel;
    protected QGraphicsPixmapItem mirrorLeft,mirrorRight,velocimeter;
    protected QGraphicsScene scene;
    protected QGraphicsPixmapItem actPedal;
    protected Ui_Radio ui_Radio;
    protected playCars game;
    protected Radio myRadio;
    protected int speed = 0;
    protected int maxColisions; // Configurable
    protected int maxSpeed; // Configurable
    // Configurar sensibilidad girando, grado de giro //
    
    public static void main(String[] args) {
        QApplication.initialize(args);

        wheelSimulator testwheelSimulator = new wheelSimulator(null);
        testwheelSimulator.show();

        QApplication.exec();
    }

    public wheelSimulator() {
        ui.setupUi(this);
    }

    public wheelSimulator(QWidget parent) {
        super(parent);
        ui.setupUi(this);
        this.setWindowTitle("JoalRace Ferrari Game");
        this.setWindowIcon(new QIcon("classpath:icons/play.png"));
        this.maxColisions = conf.maxColisiones <= 20 ? conf.maxColisiones : 20;
        this.maxSpeed = conf.maxSpeed <= 116 ? conf.maxSpeed : 116;
        this.setMinimumSize(1248,1024);
        this.setGraphicsView();
        this.setConnects();
        this.setBackground();
        this.setVelocimeters();
        this.setWheel();      
        if(conf.checkedRadio) this.showRadio();
        this.setGame();
    }
    
    public Radio getRadio(){ return myRadio; }
    
    protected void setBackground(){
    	scene.addPixmap(new QPixmap("classpath:icons/interiorferrari.jpg").scaled(1240,600));
    }    

    public int getSpeed(){ return speed; }
    public int getMaxSpeed(){ return maxSpeed; }
    
    public int getMaxColisions() { return maxColisions; }
    
    protected void setGame(){
    	game = new playCars(ui.qgv,this);
    	game.setGeometry(710,30,100,250);
    	//game.setStyleSheet("border: 1px solid blue;");
    }
    
    protected void showRadio(){
    	myRadio = new Radio(ui.qgv);
    	myRadio.setGeometry(750,350,300,300);
    	myRadio.show();
    	conf.checkedRadio = true;
    }
    
    protected void noShowRadio(){
    	if(conf.checkedRadio){
    		myRadio.close();
    		conf.checkedRadio = false;
    	}
    }
    
    protected void setVelocimeters(){
    	this.velocimeter = scene.addPixmap(new QPixmap("classpath:icons/0.png").scaled(90,90));
    	this.velocimeter.moveBy(445,210);
    }
    
    protected void setGraphicsView(){
    	ui.qgv = new QGraphicsView(this);
    	ui.qgv.setGeometry(new QRect(0,20,1370,700));
        scene = new QGraphicsScene(this);
        ui.qgv.setScene(scene);
    }
    
    protected void setWheel(){   
        wheel = scene.addPixmap(new QPixmap("classpath:icons/volante.png").scaled(450,450));
        wheel.moveBy(265,124);
        //wheel.setFlag(QGraphicsItem.GraphicsItemFlag.ItemIsMovable,true);
    }
   
    protected void setConnects(){
    	ui.girDerAction.triggered.connect(this,"girDer()");
    	ui.girIzqAction.triggered.connect(this,"girIzq()");
    	ui.runAction.triggered.connect(this,"carRun()");
    	ui.frenAction.triggered.connect(this,"carBrake()");
    	ui.actionMostrar.triggered.connect(this,"showRadio()");
    	ui.actionNoMostrar.triggered.connect(this,"noShowRadio()");
    }
    
    
    protected void carRun(){
    	if(speed<maxSpeed){
    		try{
    			actPedal = scene.addPixmap(new QPixmap("classpath:icons/acelerar.png"));
    			actPedal.setPos(435,460);
    			actPedal = scene.addPixmap(new QPixmap("classpath:icons/nofrenar.png"));
    			actPedal.setPos(375,450);
    		}catch(Exception e){ System.err.println("Imagen no encontrada"); }
    		finally{
    			speed += 2;
    		}
    	}
    	if(speed%10==0){
    		this.velocimeter.setPixmap(new QPixmap("classpath:icons/"+speed+".png").scaled(90,90));
    	}
    	game.actLabelSpeed("  ·Speed: " + speed + " Km/h");
    }
    
    protected void carBrake(){
    	if(speed>0){
    		try{
    			actPedal = scene.addPixmap(new QPixmap("classpath:icons/frenar.png"));
    			actPedal.setPos(375,450);
    			actPedal = scene.addPixmap(new QPixmap("classpath:icons/noacelerar.png"));
    			actPedal.setPos(435,460);
    		}catch(Exception e){ System.err.println("Imagen no encontrada"); }
    		finally{
    			speed -= 2;
    		}
    	}
    	if(speed%10==0){
    		this.velocimeter.setPixmap(new QPixmap("classpath:icons/"+speed+".png").scaled(90,90));
    	}
    	game.actLabelSpeed("  ·Speed: " + speed + " Km/h");
    }
    
    protected void girDer(){
    	if(maxGir <= 30){
    		wheel.setTransform(new QTransform().translate(224,224).rotate(30).translate(-224,-224),true);    		
    		maxGir += 2;
    		QGraphicsPixmapItem myCar = game.getMyCar(); 
    		myCar.moveBy(10,0);
    	}
    }
    
    protected void girIzq(){
    	if(maxGir >= -35){
    		wheel.setTransform(new QTransform().translate(224,224).rotate(-30).translate(-224,-224),true);
    		maxGir -= 2;
    		QGraphicsPixmapItem myCar = game.getMyCar(); 
    		myCar.moveBy(-10,0); // Sensibilidad
    	}
    } 
}

