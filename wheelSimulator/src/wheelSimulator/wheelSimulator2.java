package wheelSimulator;

import com.trolltech.qt.gui.*;

// Ahorro de código usando herencia, solo se reimplementarán los métodos de posicionamiento
// de widgets para ajustar a nuevas posiciones (putada carrun y carbrake para pedales)
public class wheelSimulator2 extends wheelSimulator {

    public static void main(String[] args) {
        QApplication.initialize(args);

        wheelSimulator2 testwheelSimulator2 = new wheelSimulator2(null);
        testwheelSimulator2.show();

        QApplication.exec();
    }

    public wheelSimulator2(QWidget parent) {
        super(parent);
    }
    
    protected void setBackground(){
    	scene.addPixmap(new QPixmap("classpath:icons/interiorporsche.jpg").scaled(1240,600));
    }    
    
    protected void setGame(){
    	game = new playCars(ui.qgv,this);
    	game.setGeometry(800,70,100,250);
    	//game.setStyleSheet("border: 1px solid blue;");
    }
    
    protected void showRadio(){
    	myRadio = new Radio(ui.qgv);
    	myRadio.setGeometry(570,310,300,300);
    	myRadio.show();
    	conf.checkedRadio = true;
    }
    
    protected void setVelocimeters(){
    	this.velocimeter = scene.addPixmap(new QPixmap("classpath:icons/0.png").scaled(90,90));
    	this.velocimeter.moveBy(490,140);
    }
    
    protected void setWheel(){   
    	// 390,240
        wheel = scene.addPixmap(new QPixmap("classpath:icons/volanteporsche.png").scaled(450,450));
        wheel.moveBy(120,120);
        //wheel.setFlag(QGraphicsItem.GraphicsItemFlag.ItemIsMovable,true);
    }
    
    protected void carRun(){
    	if(speed<maxSpeed){
    		try{
    			actPedal = scene.addPixmap(new QPixmap("classpath:icons/acelerar.png"));
    			actPedal.setPos(375,350);
    			actPedal = scene.addPixmap(new QPixmap("classpath:icons/nofrenar.png"));
    			actPedal.setPos(305,340);
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
    			actPedal.setPos(305,340);
    			actPedal = scene.addPixmap(new QPixmap("classpath:icons/noacelerar.png"));
    			actPedal.setPos(375,350);
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
