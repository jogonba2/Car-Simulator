/********************************************************************************
** Form generated from reading ui file 'playCars.jui'
**
** Created: sáb 19. abr 00:37:13 2014
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package wheelSimulator;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_playCars implements com.trolltech.qt.QUiForm<QWidget>
{
    public QGraphicsView graphicsView;

    public Ui_playCars() { super(); }

    public void setupUi(QWidget playCars)
    {
        playCars.setObjectName("playCars");
        playCars.resize(new QSize(800,850));
        graphicsView = new QGraphicsView(playCars);
        graphicsView.setObjectName("graphicsView");
        graphicsView.setGeometry(new QRect(0, 0, 401, 301));
        retranslateUi(playCars);

        playCars.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget playCars)
    {
        playCars.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("playCars", "Form", null));
    } // retranslateUi

}

