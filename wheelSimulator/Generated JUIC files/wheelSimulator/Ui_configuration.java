/********************************************************************************
** Form generated from reading ui file 'configuration.jui'
**
** Created: vie 23. may 18:50:03 2014
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package wheelSimulator;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_configuration implements com.trolltech.qt.QUiForm<QWidget>
{
    public QTabWidget tabWidget;
    public QWidget tab;
    public QListWidget songListWidget;
    public QLabel label;
    public QWidget layoutWidget;
    public QVBoxLayout verticalLayout;
    public QPushButton songButtonAdd;
    public QPushButton songButtonDelete;
    public QPushButton songButtonDeleteAll;
    public QWidget layoutWidget1;
    public QHBoxLayout horizontalLayout;
    public QCheckBox songRadioCheckbox;
    public QCheckBox songSilenceCheckbox;
    public QWidget tab_2;
    public QWidget layoutWidget2;
    public QVBoxLayout verticalLayout_2;
    public QHBoxLayout horizontalLayout_3;
    public QLabel label_2;
    public QComboBox controlesRunComboBox;
    public QHBoxLayout horizontalLayout_4;
    public QLabel label_3;
    public QComboBox controlesBrakeComboBox;
    public QHBoxLayout horizontalLayout_5;
    public QLabel label_4;
    public QComboBox controlesLeftComboBox;
    public QHBoxLayout horizontalLayout_6;
    public QLabel label_5;
    public QComboBox controlesRightComboBox;
    public QHBoxLayout horizontalLayout_18;
    public QLabel label_24;
    public QComboBox controlesShowRadioComboBox;
    public QHBoxLayout horizontalLayout_19;
    public QLabel label_25;
    public QComboBox controlesHideRadioComboBox;
    public QHBoxLayout horizontalLayout_7;
    public QLabel label_6;
    public QComboBox controlesActivateRadioComboBox;
    public QHBoxLayout horizontalLayout_8;
    public QLabel label_7;
    public QComboBox controlesDeactivateRadioComboBox;
    public QWidget tab_3;
    public QLabel label_11;
    public QWidget layoutWidget3;
    public QVBoxLayout verticalLayout_5;
    public QVBoxLayout verticalLayout_3;
    public QHBoxLayout horizontalLayout_11;
    public QLabel label_9;
    public QSpacerItem horizontalSpacer;
    public QComboBox selectCar;
    public QLabel viewCar;
    public QHBoxLayout horizontalLayout_16;
    public QLabel label_21;
    public QLineEdit selectPathLine;
    public QPushButton selectPathButton;
    public QHBoxLayout horizontalLayout_12;
    public QLabel label_14;
    public QLineEdit selectPoliceLine;
    public QPushButton selectPoliceButton;
    public QLabel viewPolice;
    public QHBoxLayout horizontalLayout_10;
    public QLabel label_10;
    public QLineEdit selectMyCarLine;
    public QPushButton selectMyCarButton;
    public QLabel viewMyCar;
    public QHBoxLayout horizontalLayout_13;
    public QLabel label_15;
    public QLineEdit selectCoinLine;
    public QPushButton selectCoinButton;
    public QLabel viewCoin;
    public QHBoxLayout horizontalLayout_15;
    public QLabel label_19;
    public QSpinBox generalMaxColisions;
    public QHBoxLayout horizontalLayout_9;
    public QLabel label_8;
    public QSpinBox generalMaxSpeed;
    public QHBoxLayout horizontalLayout_14;
    public QLabel label_20;
    public QSpinBox generalLengthMax;
    public QWidget layoutWidget_2;
    public QHBoxLayout horizontalLayout_2;
    public QPushButton acceptButton;
    public QPushButton cancelButton;

    public Ui_configuration() { super(); }

    public void setupUi(QWidget configuration)
    {
        configuration.setObjectName("configuration");
        configuration.resize(new QSize(731, 514).expandedTo(configuration.minimumSizeHint()));
        tabWidget = new QTabWidget(configuration);
        tabWidget.setObjectName("tabWidget");
        tabWidget.setGeometry(new QRect(0, 0, 731, 461));
        tab = new QWidget();
        tab.setObjectName("tab");
        songListWidget = new QListWidget(tab);
        songListWidget.setObjectName("songListWidget");
        songListWidget.setGeometry(new QRect(20, 40, 481, 341));
        label = new QLabel(tab);
        label.setObjectName("label");
        label.setGeometry(new QRect(210, 10, 201, 20));
        layoutWidget = new QWidget(tab);
        layoutWidget.setObjectName("layoutWidget");
        layoutWidget.setGeometry(new QRect(516, 20, 121, 341));
        verticalLayout = new QVBoxLayout(layoutWidget);
        verticalLayout.setObjectName("verticalLayout");
        songButtonAdd = new QPushButton(layoutWidget);
        songButtonAdd.setObjectName("songButtonAdd");

        verticalLayout.addWidget(songButtonAdd);

        songButtonDelete = new QPushButton(layoutWidget);
        songButtonDelete.setObjectName("songButtonDelete");

        verticalLayout.addWidget(songButtonDelete);

        songButtonDeleteAll = new QPushButton(layoutWidget);
        songButtonDeleteAll.setObjectName("songButtonDeleteAll");

        verticalLayout.addWidget(songButtonDeleteAll);

        layoutWidget1 = new QWidget(tab);
        layoutWidget1.setObjectName("layoutWidget1");
        layoutWidget1.setGeometry(new QRect(20, 380, 481, 51));
        horizontalLayout = new QHBoxLayout(layoutWidget1);
        horizontalLayout.setObjectName("horizontalLayout");
        songRadioCheckbox = new QCheckBox(layoutWidget1);
        songRadioCheckbox.setObjectName("songRadioCheckbox");

        horizontalLayout.addWidget(songRadioCheckbox);

        songSilenceCheckbox = new QCheckBox(layoutWidget1);
        songSilenceCheckbox.setObjectName("songSilenceCheckbox");

        horizontalLayout.addWidget(songSilenceCheckbox);

        tabWidget.addTab(tab, com.trolltech.qt.core.QCoreApplication.translate("configuration", "Audio", null));
        tab_2 = new QWidget();
        tab_2.setObjectName("tab_2");
        layoutWidget2 = new QWidget(tab_2);
        layoutWidget2.setObjectName("layoutWidget2");
        layoutWidget2.setGeometry(new QRect(150, 0, 431, 411));
        verticalLayout_2 = new QVBoxLayout(layoutWidget2);
        verticalLayout_2.setObjectName("verticalLayout_2");
        horizontalLayout_3 = new QHBoxLayout();
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        label_2 = new QLabel(layoutWidget2);
        label_2.setObjectName("label_2");

        horizontalLayout_3.addWidget(label_2);

        controlesRunComboBox = new QComboBox(layoutWidget2);
        controlesRunComboBox.setObjectName("controlesRunComboBox");

        horizontalLayout_3.addWidget(controlesRunComboBox);


        verticalLayout_2.addLayout(horizontalLayout_3);

        horizontalLayout_4 = new QHBoxLayout();
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        label_3 = new QLabel(layoutWidget2);
        label_3.setObjectName("label_3");

        horizontalLayout_4.addWidget(label_3);

        controlesBrakeComboBox = new QComboBox(layoutWidget2);
        controlesBrakeComboBox.setObjectName("controlesBrakeComboBox");

        horizontalLayout_4.addWidget(controlesBrakeComboBox);


        verticalLayout_2.addLayout(horizontalLayout_4);

        horizontalLayout_5 = new QHBoxLayout();
        horizontalLayout_5.setObjectName("horizontalLayout_5");
        label_4 = new QLabel(layoutWidget2);
        label_4.setObjectName("label_4");

        horizontalLayout_5.addWidget(label_4);

        controlesLeftComboBox = new QComboBox(layoutWidget2);
        controlesLeftComboBox.setObjectName("controlesLeftComboBox");

        horizontalLayout_5.addWidget(controlesLeftComboBox);


        verticalLayout_2.addLayout(horizontalLayout_5);

        horizontalLayout_6 = new QHBoxLayout();
        horizontalLayout_6.setObjectName("horizontalLayout_6");
        label_5 = new QLabel(layoutWidget2);
        label_5.setObjectName("label_5");

        horizontalLayout_6.addWidget(label_5);

        controlesRightComboBox = new QComboBox(layoutWidget2);
        controlesRightComboBox.setObjectName("controlesRightComboBox");

        horizontalLayout_6.addWidget(controlesRightComboBox);


        verticalLayout_2.addLayout(horizontalLayout_6);

        horizontalLayout_18 = new QHBoxLayout();
        horizontalLayout_18.setObjectName("horizontalLayout_18");
        label_24 = new QLabel(layoutWidget2);
        label_24.setObjectName("label_24");

        horizontalLayout_18.addWidget(label_24);

        controlesShowRadioComboBox = new QComboBox(layoutWidget2);
        controlesShowRadioComboBox.setObjectName("controlesShowRadioComboBox");

        horizontalLayout_18.addWidget(controlesShowRadioComboBox);


        verticalLayout_2.addLayout(horizontalLayout_18);

        horizontalLayout_19 = new QHBoxLayout();
        horizontalLayout_19.setObjectName("horizontalLayout_19");
        label_25 = new QLabel(layoutWidget2);
        label_25.setObjectName("label_25");

        horizontalLayout_19.addWidget(label_25);

        controlesHideRadioComboBox = new QComboBox(layoutWidget2);
        controlesHideRadioComboBox.setObjectName("controlesHideRadioComboBox");

        horizontalLayout_19.addWidget(controlesHideRadioComboBox);


        verticalLayout_2.addLayout(horizontalLayout_19);

        horizontalLayout_7 = new QHBoxLayout();
        horizontalLayout_7.setObjectName("horizontalLayout_7");
        label_6 = new QLabel(layoutWidget2);
        label_6.setObjectName("label_6");

        horizontalLayout_7.addWidget(label_6);

        controlesActivateRadioComboBox = new QComboBox(layoutWidget2);
        controlesActivateRadioComboBox.setObjectName("controlesActivateRadioComboBox");

        horizontalLayout_7.addWidget(controlesActivateRadioComboBox);


        verticalLayout_2.addLayout(horizontalLayout_7);

        horizontalLayout_8 = new QHBoxLayout();
        horizontalLayout_8.setObjectName("horizontalLayout_8");
        label_7 = new QLabel(layoutWidget2);
        label_7.setObjectName("label_7");

        horizontalLayout_8.addWidget(label_7);

        controlesDeactivateRadioComboBox = new QComboBox(layoutWidget2);
        controlesDeactivateRadioComboBox.setObjectName("controlesDeactivateRadioComboBox");

        horizontalLayout_8.addWidget(controlesDeactivateRadioComboBox);


        verticalLayout_2.addLayout(horizontalLayout_8);

        tabWidget.addTab(tab_2, com.trolltech.qt.core.QCoreApplication.translate("configuration", "Controles", null));
        tab_3 = new QWidget();
        tab_3.setObjectName("tab_3");
        label_11 = new QLabel(tab_3);
        label_11.setObjectName("label_11");
        label_11.setGeometry(new QRect(560, 90, 46, 20));
        layoutWidget3 = new QWidget(tab_3);
        layoutWidget3.setObjectName("layoutWidget3");
        layoutWidget3.setGeometry(new QRect(40, 20, 581, 391));
        verticalLayout_5 = new QVBoxLayout(layoutWidget3);
        verticalLayout_5.setObjectName("verticalLayout_5");
        verticalLayout_3 = new QVBoxLayout();
        verticalLayout_3.setObjectName("verticalLayout_3");
        horizontalLayout_11 = new QHBoxLayout();
        horizontalLayout_11.setObjectName("horizontalLayout_11");
        label_9 = new QLabel(layoutWidget3);
        label_9.setObjectName("label_9");

        horizontalLayout_11.addWidget(label_9);

        horizontalSpacer = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_11.addItem(horizontalSpacer);

        selectCar = new QComboBox(layoutWidget3);
        selectCar.setObjectName("selectCar");

        horizontalLayout_11.addWidget(selectCar);

        viewCar = new QLabel(layoutWidget3);
        viewCar.setObjectName("viewCar");

        horizontalLayout_11.addWidget(viewCar);


        verticalLayout_3.addLayout(horizontalLayout_11);

        horizontalLayout_16 = new QHBoxLayout();
        horizontalLayout_16.setObjectName("horizontalLayout_16");
        label_21 = new QLabel(layoutWidget3);
        label_21.setObjectName("label_21");

        horizontalLayout_16.addWidget(label_21);

        selectPathLine = new QLineEdit(layoutWidget3);
        selectPathLine.setObjectName("selectPathLine");

        horizontalLayout_16.addWidget(selectPathLine);

        selectPathButton = new QPushButton(layoutWidget3);
        selectPathButton.setObjectName("selectPathButton");

        horizontalLayout_16.addWidget(selectPathButton);


        verticalLayout_3.addLayout(horizontalLayout_16);

        horizontalLayout_12 = new QHBoxLayout();
        horizontalLayout_12.setObjectName("horizontalLayout_12");
        label_14 = new QLabel(layoutWidget3);
        label_14.setObjectName("label_14");

        horizontalLayout_12.addWidget(label_14);

        selectPoliceLine = new QLineEdit(layoutWidget3);
        selectPoliceLine.setObjectName("selectPoliceLine");

        horizontalLayout_12.addWidget(selectPoliceLine);

        selectPoliceButton = new QPushButton(layoutWidget3);
        selectPoliceButton.setObjectName("selectPoliceButton");

        horizontalLayout_12.addWidget(selectPoliceButton);

        viewPolice = new QLabel(layoutWidget3);
        viewPolice.setObjectName("viewPolice");
        viewPolice.setMaximumSize(new QSize(1666666, 1666666));

        horizontalLayout_12.addWidget(viewPolice);


        verticalLayout_3.addLayout(horizontalLayout_12);

        horizontalLayout_10 = new QHBoxLayout();
        horizontalLayout_10.setObjectName("horizontalLayout_10");
        label_10 = new QLabel(layoutWidget3);
        label_10.setObjectName("label_10");

        horizontalLayout_10.addWidget(label_10);

        selectMyCarLine = new QLineEdit(layoutWidget3);
        selectMyCarLine.setObjectName("selectMyCarLine");

        horizontalLayout_10.addWidget(selectMyCarLine);

        selectMyCarButton = new QPushButton(layoutWidget3);
        selectMyCarButton.setObjectName("selectMyCarButton");

        horizontalLayout_10.addWidget(selectMyCarButton);

        viewMyCar = new QLabel(layoutWidget3);
        viewMyCar.setObjectName("viewMyCar");

        horizontalLayout_10.addWidget(viewMyCar);


        verticalLayout_3.addLayout(horizontalLayout_10);

        horizontalLayout_13 = new QHBoxLayout();
        horizontalLayout_13.setObjectName("horizontalLayout_13");
        label_15 = new QLabel(layoutWidget3);
        label_15.setObjectName("label_15");

        horizontalLayout_13.addWidget(label_15);

        selectCoinLine = new QLineEdit(layoutWidget3);
        selectCoinLine.setObjectName("selectCoinLine");

        horizontalLayout_13.addWidget(selectCoinLine);

        selectCoinButton = new QPushButton(layoutWidget3);
        selectCoinButton.setObjectName("selectCoinButton");

        horizontalLayout_13.addWidget(selectCoinButton);

        viewCoin = new QLabel(layoutWidget3);
        viewCoin.setObjectName("viewCoin");

        horizontalLayout_13.addWidget(viewCoin);


        verticalLayout_3.addLayout(horizontalLayout_13);

        horizontalLayout_15 = new QHBoxLayout();
        horizontalLayout_15.setObjectName("horizontalLayout_15");
        label_19 = new QLabel(layoutWidget3);
        label_19.setObjectName("label_19");

        horizontalLayout_15.addWidget(label_19);

        generalMaxColisions = new QSpinBox(layoutWidget3);
        generalMaxColisions.setObjectName("generalMaxColisions");
        generalMaxColisions.setMinimum(1);
        generalMaxColisions.setMaximum(20);
        generalMaxColisions.setValue(5);

        horizontalLayout_15.addWidget(generalMaxColisions);


        verticalLayout_3.addLayout(horizontalLayout_15);

        horizontalLayout_9 = new QHBoxLayout();
        horizontalLayout_9.setObjectName("horizontalLayout_9");
        label_8 = new QLabel(layoutWidget3);
        label_8.setObjectName("label_8");

        horizontalLayout_9.addWidget(label_8);

        generalMaxSpeed = new QSpinBox(layoutWidget3);
        generalMaxSpeed.setObjectName("generalMaxSpeed");
        generalMaxSpeed.setMinimum(10);
        generalMaxSpeed.setMaximum(116);

        horizontalLayout_9.addWidget(generalMaxSpeed);


        verticalLayout_3.addLayout(horizontalLayout_9);

        horizontalLayout_14 = new QHBoxLayout();
        horizontalLayout_14.setObjectName("horizontalLayout_14");
        label_20 = new QLabel(layoutWidget3);
        label_20.setObjectName("label_20");

        horizontalLayout_14.addWidget(label_20);

        generalLengthMax = new QSpinBox(layoutWidget3);
        generalLengthMax.setObjectName("generalLengthMax");
        generalLengthMax.setMinimum(500);
        generalLengthMax.setMaximum(30000);

        horizontalLayout_14.addWidget(generalLengthMax);


        verticalLayout_3.addLayout(horizontalLayout_14);


        verticalLayout_5.addLayout(verticalLayout_3);

        tabWidget.addTab(tab_3, com.trolltech.qt.core.QCoreApplication.translate("configuration", "Juego", null));
        layoutWidget_2 = new QWidget(configuration);
        layoutWidget_2.setObjectName("layoutWidget_2");
        layoutWidget_2.setGeometry(new QRect(460, 460, 271, 51));
        horizontalLayout_2 = new QHBoxLayout(layoutWidget_2);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        acceptButton = new QPushButton(layoutWidget_2);
        acceptButton.setObjectName("acceptButton");

        horizontalLayout_2.addWidget(acceptButton);

        cancelButton = new QPushButton(layoutWidget_2);
        cancelButton.setObjectName("cancelButton");

        horizontalLayout_2.addWidget(cancelButton);

        retranslateUi(configuration);

        tabWidget.setCurrentIndex(2);


        configuration.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget configuration)
    {
        configuration.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Form", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Lista de reproducci\u00f3n", null));
        songButtonAdd.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "A\u00f1adir Canci\u00f3n", null));
        songButtonDelete.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Eliminar Canci\u00f3n", null));
        songButtonDeleteAll.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Eliminar Todo", null));
        songRadioCheckbox.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Interfaz Radio", null));
        songSilenceCheckbox.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Silenciar", null));
        tabWidget.setTabText(tabWidget.indexOf(tab), com.trolltech.qt.core.QCoreApplication.translate("configuration", "Audio", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Acelerar", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Frenar", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Ir Izquierda", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Ir Derecha", null));
        label_24.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Mostrar Radio", null));
        label_25.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Ocultar Radio", null));
        label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Activar Radio", null));
        label_7.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Desactivar Radio", null));
        tabWidget.setTabText(tabWidget.indexOf(tab_2), com.trolltech.qt.core.QCoreApplication.translate("configuration", "Controles", null));
        label_11.setText("");
        label_9.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Mi Coche", null));
        selectCar.clear();
        selectCar.addItem(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Ferrari", null));
        selectCar.addItem(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Porsche", null));
        viewCar.setText("");
        label_21.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Path Records", null));
        selectPathButton.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Abrir...", null));
        label_14.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Polic\u00eda", null));
        selectPoliceButton.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Abrir...", null));
        viewPolice.setText("");
        label_10.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Coche", null));
        selectMyCarButton.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Abrir...", null));
        viewMyCar.setText("");
        label_15.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Monedas", null));
        selectCoinButton.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Abrir...", null));
        viewCoin.setText("");
        label_19.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "M\u00e1x Colisiones", null));
        label_8.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Velocidad M\u00e1xima", null));
        label_20.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Longitud trazado", null));
        tabWidget.setTabText(tabWidget.indexOf(tab_3), com.trolltech.qt.core.QCoreApplication.translate("configuration", "Juego", null));
        acceptButton.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Aceptar", null));
        cancelButton.setText(com.trolltech.qt.core.QCoreApplication.translate("configuration", "Cancelar", null));
    } // retranslateUi

}

