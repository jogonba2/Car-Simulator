package wheelSimulator;

import com.trolltech.qt.gui.*;

public class help extends QWidget {

    Ui_help ui = new Ui_help();

    public static void main(String[] args) {
        QApplication.initialize(args);

        help testhelp = new help(null);
        testhelp.show(); 

        QApplication.exec();
    }

    public help() {
        ui.setupUi(this);
    }

    public help(QWidget parent) {
        super(parent);
        ui.setupUi(this);
        this.setWindowTitle("Tutorial");
        this.setWindowIcon(new QIcon("classpath:icons/tut.png"));
        // Mostrar tamaños de volantes pedales y otros elementos para obligar al usuario a colocarlos 
        // de ese tamaño //
        this.setImages();
    }
    
    private void setImages(){
    	ui.imgAcelerado.setPixmap(new QPixmap("classpath:icons/acelerar.png").scaled(150,150));
    	ui.imgFrenado.setPixmap(new QPixmap("classpath:icons/frenar.png").scaled(150,150));
    	ui.imgMyCar.setPixmap(new QPixmap("classpath:icons/mycar.png").scaled(50,50));
    	ui.imgCoin.setPixmap(new QPixmap("classpath:icons/money.png").scaled(50,50));
    	ui.imgPoliceCar.setPixmap(new QPixmap("classpath:icons/policecar.png").scaled(50,50));


    }
}
