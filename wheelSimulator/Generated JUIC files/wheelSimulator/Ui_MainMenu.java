/********************************************************************************
** Form generated from reading ui file 'MainMenu.jui'
**
** Created: mié 23. abr 02:32:39 2014
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package wheelSimulator;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_MainMenu implements com.trolltech.qt.QUiForm<QWidget>
{
    public QGraphicsView graphicsView;

    public Ui_MainMenu() { super(); }

    public void setupUi(QWidget MainMenu)
    {
        MainMenu.setObjectName("MainMenu");
        MainMenu.resize(new QSize(700, 554).expandedTo(MainMenu.minimumSizeHint()));
        graphicsView = new QGraphicsView(MainMenu);
        graphicsView.setObjectName("graphicsView");
        graphicsView.setGeometry(new QRect(0, 0, 701, 561));
        retranslateUi(MainMenu);

        MainMenu.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget MainMenu)
    {
        MainMenu.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainMenu", "Form", null));
    } // retranslateUi

}

