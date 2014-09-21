package wheelSimulator;

import com.trolltech.qt.core.QRect;
import com.trolltech.qt.gui.*;
import java.io.*;
public class records extends QWidget {

    Ui_records ui = new Ui_records();
    private QGraphicsScene scene = null;
    private final int x = 95;
    private int y = 150;
    private int offset = 0;
    
    public static void main(String[] args) {
        QApplication.initialize(args);

        records testrecords = new records(null);
        testrecords.show();

        QApplication.exec();
    }

    public records() {
        ui.setupUi(this);
    }

    public records(QWidget parent) {
        super(parent);
        ui.setupUi(this);
        this.setWindowTitle("Records");
        this.setWindowIcon(new QIcon("classpath:icons/records.png"));
        this.setGraphicsView();
        this.setLabelRecords();
    }
    
    private void setGraphicsView(){
    	setMaximumSize(690,690);
    	setMinimumSize(690,690);
    	ui.graphicsView = new QGraphicsView(this);
    	ui.graphicsView.setGeometry(new QRect(0,0,690,690));
        scene = new QGraphicsScene(ui.graphicsView);
        ui.graphicsView.setScene(scene);
        // Background
        QGraphicsPixmapItem bg = scene.addPixmap(new QPixmap("classpath:icons/records.jpg").scaled(687,687));
        bg.setPos(-1000,0);
    }
    
    // Por implementar 5 mejores //
    public void setLabelRecords(){
    	try{
    		FileReader fd = new FileReader(new File(conf.pathRecords));
    		BufferedReader bfd = new BufferedReader(fd);
    		String line = null;
    		while((line = bfd.readLine()) != null){
    			QLabel actLabel = new QLabel(this);
    			String splitted[] = line.split(",");
    			QFont font = new QFont();
    			font.setPointSize(13);
    			actLabel.setFont(font);
    			actLabel.setText("  ·Nombre: " + splitted[0] + "  ·Recorrido: " + splitted[1] + "  ·Colisiones: " + splitted[2] + "  ·Monedas: " + splitted[3]);
    			actLabel.setGeometry(x,y+offset,600,50);
    			offset += 40;
    		}
    		bfd.close();
    		fd.close();
    	}catch(FileNotFoundException e){}
    	catch(IOException e){}   	
    }
}
