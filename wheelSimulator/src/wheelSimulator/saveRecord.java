package wheelSimulator;

import com.trolltech.qt.gui.*;
import java.io.*;
public class saveRecord extends QWidget {

    Ui_saveRecord ui = new Ui_saveRecord();
    private int traveled,colisiones,monedas;

    public saveRecord() {
        ui.setupUi(this);
    }

    public saveRecord(QWidget parent,int traveled,int colisiones,int monedas) {
        super(parent);
        ui.setupUi(this);
        this.setWindowTitle("Nuevo Record");
        this.setWindowIcon(new QIcon("classpath:icons/records.png"));
        this.traveled = traveled;
        this.colisiones = colisiones;
        this.monedas = monedas;
        this.setConnects();
    }
    
    private void setConnects(){
    	ui.savePushButton.clicked.connect(this,"saveData()");
    	ui.noSavePushButton.clicked.connect(this,"close()");
    }
    
    private void saveData(){
    	try{
    		FileWriter fw = new FileWriter(new File(conf.pathRecords),true);
    		PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
    		pw.append(ui.nameLineEdit.text()+","+this.traveled+","+this.colisiones+","+this.monedas+"\r\n");
    		pw.close();
    		fw.close();
    	}catch(FileNotFoundException e){}
    	catch(IOException e){}
    	close();
    }
}
