package wheelSimulator;

import com.trolltech.qt.core.QRect;
import com.trolltech.qt.gui.*;

public class MainMenu extends QWidget {

    Ui_MainMenu ui = new Ui_MainMenu();
	private QGraphicsScene scene;
	private QPushButton jugar,tutorial,record,ajustes,salir;
	private help helpDialog;
	private Object wSim;
	private configuration config;
	private records rcd;

    public static void main(String[] args) {
        QApplication.initialize(args);
        MainMenu testMainMenu = new MainMenu(null);
        testMainMenu.show();        
        QApplication.exec();
    }

    public MainMenu() {
        ui.setupUi(this);
    }

    public MainMenu(QWidget parent) {
        super(parent);
        ui.setupUi(this); 
        this.setWindowTitle("JoalRace Ferrari Menu");
        this.setWindowIcon(new QIcon("classpath:icons/mycar.png"));
        this.setGraphicsView();
        this.setButtons();
        this.setConnects();
    }
    
    private void setGraphicsView(){
    	setMaximumSize(690,690);
    	setMinimumSize(690,690);
    	ui.graphicsView = new QGraphicsView(this);
    	ui.graphicsView.setGeometry(new QRect(0,0,690,690));
        scene = new QGraphicsScene(ui.graphicsView);
        ui.graphicsView.setScene(scene);
        // Background
        QGraphicsPixmapItem bg = scene.addPixmap(new QPixmap("classpath:icons/mainMenu.jpg").scaled(687,687));
        bg.setPos(-1000,0);
    }
    
    private void setButtons(){
    	jugar = new QPushButton("Jugar");
    	jugar.setIcon(new QIcon("classpath:icons/play.png"));
    	scene.addWidget(jugar).setPos(-900,450);
    	tutorial = new QPushButton("Tutorial");
    	tutorial.setIcon(new QIcon("classpath:icons/tut.png"));
    	scene.addWidget(tutorial).setPos(-900,480);
    	record = new QPushButton("Records");
    	record.setIcon(new QIcon("classpath:icons/record.png"));
    	scene.addWidget(record).setPos(-900,510);
    	ajustes = new QPushButton("Ajustes");
    	scene.addWidget(ajustes).setPos(-900,540);
    	ajustes.setIcon(new QIcon("classpath:icons/config.png"));
    	salir = new QPushButton("Salir");
    	salir.setIcon(new QIcon("classpath:icons/exit.png"));
    	scene.addWidget(salir).setPos(-900,570);  	
    }
    
    private void setConnects(){
    	this.jugar.clicked.connect(this,"throwGame()");
    	this.tutorial.clicked.connect(this,"throwHelp()");
    	this.record.clicked.connect(this,"throwRecords()");
    	this.ajustes.clicked.connect(this,"throwConfig()");
    	this.salir.clicked.connect(this,"quit()");
    }
    
    private void throwGame(){
    	if(conf.carSelected==0) wSim = new wheelSimulator(null);
    	else if(conf.carSelected==1) wSim = new wheelSimulator2(null);
    	((wheelSimulator)wSim).show();
    }
    
    private void throwHelp(){
    	helpDialog = new help(null); 
    	helpDialog.show();
    }
    
    private void throwRecords(){
    	rcd = new records(null); 
    	rcd.show();
    }
    
    private void throwConfig(){
    	config = new configuration(null);
    	config.show();
    }
    
    private void quit(){
    	System.exit(0);
    }
    
}
