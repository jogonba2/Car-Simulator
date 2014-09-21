package wheelSimulator;

import com.trolltech.qt.gui.*;

public class Radio extends QWidget {

    Ui_Radio ui = new Ui_Radio();
    public QSound actSound;

    public static void main(String[] args) {
        QApplication.initialize(args);

        Radio testRadio = new Radio(null);
        testRadio.show();

        QApplication.exec();
    }

    public Radio() {
        ui.setupUi(this);
    }

    public Radio(QWidget parent) {
        super(parent);
        ui.setupUi(this);
        this.actSound = null;
        this.setConnects();
    }
    
    private void setConnects(){
    	ui.onButton.clicked.connect(this,"onRadio()");
    	ui.offButton.clicked.connect(this,"offRadio()");
    }
    
    private void onRadio(){ 
    	if(conf.numSongs>0){
    		for(String song : conf.mySongs){
    			if(song != null){
    				this.actSound = new QSound(song);
    				this.actSound.play();
    			}
    		}
    	}
    }
    private void offRadio(){ 
    	if(this.actSound!=null) this.actSound.stop();
    }  
}
