/********************************************************************************
** Form generated from reading ui file 'Radio.jui'
**
** Created: vie 18. abr 23:56:23 2014
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package wheelSimulator;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Radio implements com.trolltech.qt.QUiForm<QWidget>
{
    public QDockWidget dockWidget;
    public QWidget dockWidgetContents;
    public QVBoxLayout verticalLayout_2;
    public QVBoxLayout verticalLayout;
    public QLCDNumber lcdFrequency;
    public QHBoxLayout horizontalLayout_2;
    public QDial dialUno;
    public QHBoxLayout horizontalLayout;
    public QPushButton onButton;
    public QPushButton offButton;

    public Ui_Radio() { super(); }

    public void setupUi(QWidget Radio)
    {
        Radio.setObjectName("Radio");
        Radio.resize(new QSize(228, 203).expandedTo(Radio.minimumSizeHint()));
        dockWidget = new QDockWidget(Radio);
        dockWidget.setObjectName("dockWidget");
        dockWidget.setGeometry(new QRect(0, 0, 228, 204));
        dockWidgetContents = new QWidget();
        dockWidgetContents.setObjectName("dockWidgetContents");
        verticalLayout_2 = new QVBoxLayout(dockWidgetContents);
        verticalLayout_2.setObjectName("verticalLayout_2");
        verticalLayout = new QVBoxLayout();
        verticalLayout.setObjectName("verticalLayout");
        lcdFrequency = new QLCDNumber(dockWidgetContents);
        lcdFrequency.setObjectName("lcdFrequency");

        verticalLayout.addWidget(lcdFrequency);

        horizontalLayout_2 = new QHBoxLayout();
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        dialUno = new QDial(dockWidgetContents);
        dialUno.setObjectName("dialUno");

        horizontalLayout_2.addWidget(dialUno);


        verticalLayout.addLayout(horizontalLayout_2);


        verticalLayout_2.addLayout(verticalLayout);

        horizontalLayout = new QHBoxLayout();
        horizontalLayout.setObjectName("horizontalLayout");
        onButton = new QPushButton(dockWidgetContents);
        onButton.setObjectName("onButton");

        horizontalLayout.addWidget(onButton);

        offButton = new QPushButton(dockWidgetContents);
        offButton.setObjectName("offButton");

        horizontalLayout.addWidget(offButton);


        verticalLayout_2.addLayout(horizontalLayout);

        dockWidget.setWidget(dockWidgetContents);
        retranslateUi(Radio);

        Radio.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Radio)
    {
        Radio.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Radio", "Form", null));
        dialUno.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Radio", "Aumenta 0.1 frecuencia", null));
        onButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Radio", "ON", null));
        offButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Radio", "OFF", null));
    } // retranslateUi

}

