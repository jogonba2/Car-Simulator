package wheelSimulator;

import com.trolltech.qt.gui.*;

import java.lang.reflect.*;

import com.trolltech.qt.core.QEvent;
import com.trolltech.qt.core.Qt;
import com.trolltech.qt.core.Qt.CheckState;
public class configuration extends QWidget {

    Ui_configuration ui = new Ui_configuration();
    private QComboBox actComboBox = null;
    private String actSetting = null;
    
    public static void main(String[] args) {
        QApplication.initialize(args);
        configuration testconfiguration = new configuration(null);
        testconfiguration.show();
        QApplication.exec();
    }

    public configuration() {
        ui.setupUi(this);
    }

    public configuration(QWidget parent) {
        super(parent);
        ui.setupUi(this);
        this.setWindowTitle("Ajustes");
        this.setWindowIcon(new QIcon("classpath:icons/config.png"));
        this.initSongWindow();
        this.initControls();
        this.setConnects();
        this.initConfGame();
        this.setFocus();
        

    }
    
    private void initConfGame(){
        if(conf.carSelected==0) ui.viewCar.setPixmap(new QPixmap("classpath:icons/interiorferrari.jpg").scaled(90,75));
        else if(conf.carSelected==1) ui.viewCar.setPixmap(new QPixmap("classpath:icons/interiorporsche.jpg").scaled(50,50));
        ui.viewPolice.setPixmap(new QPixmap(conf.pathPoliceCar).scaled(50,50));
        ui.viewMyCar.setPixmap(new QPixmap(conf.pathMyCar).scaled(50,50));
        ui.viewCoin.setPixmap(new QPixmap(conf.pathMoney).scaled(50,50));
        ui.generalMaxColisions.setValue(conf.maxColisiones);
        ui.generalLengthMax.setValue(conf.longTrazado);
        ui.generalMaxSpeed.setValue(conf.maxSpeed);
    }
    
    private  void setConnects(){
    	ui.songButtonAdd.clicked.connect(this,"addSong()");
    	ui.songButtonDelete.clicked.connect(this,"deleteAct()");
    	ui.acceptButton.clicked.connect(this,"genericButton()");
    	ui.cancelButton.clicked.connect(this,"genericButton()");
    	ui.songRadioCheckbox.stateChanged.connect(this,"checkRadio(int)");
    	ui.controlesRunComboBox.activatedIndex.connect(this,"controlesSetRunButton(int)");
    	ui.controlesBrakeComboBox.activatedIndex.connect(this,"controlesSetBrakeButton(int)");
    	ui.controlesLeftComboBox.activatedIndex.connect(this,"controlesSetLeftButton(int)");
    	ui.controlesRightComboBox.activatedIndex.connect(this,"controlesSetRightButton(int)");
    	ui.controlesActivateRadioComboBox.activatedIndex.connect(this,"controlesSetActivateRadioButton(int)");
    	ui.controlesDeactivateRadioComboBox.activatedIndex.connect(this,"controlesSetDeactivateRadioButton(int)");
    	ui.controlesShowRadioComboBox.activatedIndex.connect(this,"controlesSetRadioShow(int)");
    	ui.controlesHideRadioComboBox.activatedIndex.connect(this,"controlesSetRadioHide(int)");
    	ui.generalMaxColisions.valueChanged.connect(this,"generalSetMaxColisions(int)");
    	ui.generalLengthMax.valueChanged.connect(this,"generalSetLengthMax(int)");
    	ui.generalMaxSpeed.valueChanged.connect(this,"generalSetMaxSpeed(int)");
    	ui.selectPathButton.clicked.connect(this,"selectRecordsFile()");
    	ui.selectPoliceButton.clicked.connect(this,"openPoliceFile()");
    	ui.selectCoinButton.clicked.connect(this,"openCoinFile()");
    	ui.selectMyCarButton.clicked.connect(this,"openMyCarFile()");
    	ui.selectCar.activatedIndex.connect(this,"setCurrentCar(int)");
    }

    private void selectRecordsFile(){
    	String recordFile = QFileDialog.getOpenFileName();
    	conf.pathRecords = recordFile;
    	ui.selectPathLine.setText(recordFile);
    	ui.selectPathLine.setReadOnly(true);
    }
    
    private void openMyCarFile(){
    	String myCarFile = QFileDialog.getOpenFileName();
    	ui.selectMyCarLine.setText(myCarFile);
    	ui.viewMyCar.setPixmap(new QPixmap(myCarFile).scaled(65,65));
    	conf.pathMyCar = myCarFile;
    	ui.selectMyCarLine.setReadOnly(true);
    }
    
    private void openPoliceFile(){
    	String policeFile = QFileDialog.getOpenFileName();
    	ui.selectPoliceLine.setText(policeFile);
    	ui.viewPolice.setPixmap(new QPixmap(policeFile).scaled(65,65));
    	conf.pathPoliceCar = policeFile;
    	ui.selectPoliceLine.setReadOnly(true);
    }
    
    private void openCoinFile(){
    	String coinFile = QFileDialog.getOpenFileName();
    	ui.selectCoinLine.setText(coinFile);
    	ui.viewCoin.setPixmap(new QPixmap(coinFile).scaled(65,65));
    	conf.pathMoney = coinFile;
    	ui.selectCoinLine.setReadOnly(true);
    }
    
    private void setCurrentCar(int numCar){
    	String currentCar = ui.selectCar.itemText(numCar);
    	if(currentCar.equals("Ferrari")){
    		conf.carSelected = 0;
    		ui.viewCar.setPixmap(new QPixmap("classpath:icons/interiorferrari.jpg").scaled(90,90));
    	}
    	else if(currentCar.equals("Porsche")){
    		conf.carSelected = 1;
    		ui.viewCar.setPixmap(new QPixmap("classpath:icons/interiorporsche.jpg").scaled(90,90));
    	}
    }
    
    private void generalSetMaxSpeed(int e){
    	conf.maxSpeed = e;
    }
    private void generalSetMaxColisions(int e){
    	conf.maxColisiones = e;
    }
    
    private void generalSetLengthMax(int e){
    	conf.longTrazado = e;
    }
    
    private void initControls(){
    	ui.controlesRunComboBox.addItem("F");
    	ui.controlesBrakeComboBox.addItem("D");
    	ui.controlesLeftComboBox.addItem("Left");
    	ui.controlesRightComboBox.addItem("Right");
    	ui.controlesActivateRadioComboBox.addItem("None");
    	ui.controlesDeactivateRadioComboBox.addItem("None");
    	ui.controlesShowRadioComboBox.addItem("None");
    	ui.controlesHideRadioComboBox.addItem("None");
    }
    
    private void initSongWindow(){
    	this.showSongs();
    	this.setAudioChecks();
    }
    
    //                SET BUTTONS                // 
    // Se pone el combobox actual el combobox seleccionado //
    // Hay que devolver el foco al widget por que si no se queda en el combobox y keyevent no tiene efecto //

    private void controlesSetRadioShow(int e){
    	this.actComboBox = ui.controlesShowRadioComboBox;
    	this.actSetting = "showRadio";
    	this.setFocus();
    }
    
    private void controlesSetRadioHide(int e){
    	this.actComboBox = ui.controlesHideRadioComboBox;
    	this.actSetting = "hideRadio";
    	this.setFocus();
    }
    
    private void controlesSetLeftButton(int e){
    	this.actComboBox = ui.controlesLeftComboBox;
    	this.actSetting = "keyIzq";
    	this.setFocus();
    }
    private void controlesSetRightButton(int e){
    	this.actComboBox = ui.controlesRightComboBox;
    	this.actSetting = "keyDer";
    	this.setFocus();
    }
    
    private void controlesSetActivateRadioButton(int e){
    	this.actComboBox = ui.controlesActivateRadioComboBox;
    	this.actSetting = "actRadio";
    	this.setFocus();
    }
    
    private void controlesSetDeactivateRadioButton(int e){
    	this.actComboBox = ui.controlesDeactivateRadioComboBox;
    	this.actSetting = "deactRadio";
    	this.setFocus();
    }
    
    private void controlesSetBrakeButton(int e){
    	this.actComboBox = ui.controlesBrakeComboBox;
    	this.actSetting = "keyBrake";
    	this.setFocus();
    }
    
    private void controlesSetRunButton(int e){
    	this.actComboBox = ui.controlesRunComboBox;   
    	this.actSetting = "keyRun";
    	this.setFocus();
    	
    }
    
    // Se gestionan las pulsaciones, se eliminan los elementos del combobox actual,se inserta la tecla pulsada 
    // y se configura conf.java
    // Gestionar flechas y otros caracteres //
    protected void keyPressEvent(QKeyEvent arg__1){
    	this.actComboBox.clear();
    	try{
    		// Cuando se pulse la tecla, se accede al atributo seleccionado del combobox,
    		// Usando reflection para evitar tener que comprobar con condicionales,
    		// que comboBox tiene el foco //
    		this.actComboBox.addItem(String.valueOf(arg__1.text()).toUpperCase());
    		conf c1 = new conf();
    		Class conf = c1.getClass();
        	Field thisField = conf.getField(this.actSetting);
        	// modificar thisField
        	thisField.set(conf, String.valueOf(arg__1.text()).toUpperCase());
    	}catch(NullPointerException e){}
    	catch(Exception e){}
    }
    
    private void showSongs(){
    	for(String e : conf.mySongs){
    		if(e != null) ui.songListWidget.addItem(new QListWidgetItem(e));
    	}
    }
    
    private void setAudioChecks(){
    	if(conf.checkedRadio) ui.songRadioCheckbox.setCheckState(CheckState.Checked);
    }
    
    private void genericButton(){ this.close(); }
    
    private void checkRadio(int e){ conf.checkedRadio = e != 0 ? true : false; }
    
    private void deleteAct(){
    	if(conf.numSongs>0){
    		int row = ui.songListWidget.row(ui.songListWidget.currentItem());
    		ui.songListWidget.takeItem(row);
    		conf.mySongs[conf.numSongs] = null;
    		conf.numSongs--;
    	}
    }
    
    private void addSong(){
    	if(conf.numSongs<100){
    		String nameFile = QFileDialog.getOpenFileName();
    		String paths[] = nameFile.split("/");
    		if(paths[paths.length-1].matches("^.*wav$")){
    			ui.songListWidget.addItem(new QListWidgetItem(paths[paths.length-1]));
    			conf.mySongs[conf.numSongs] = nameFile;
    			conf.numSongs++;
    		}
    		else QMessageBox.warning(this,"Atención","Solo archivos wav");
    	}else QMessageBox.warning(this,"Atención","Máx 100 canciones");
    }
}
