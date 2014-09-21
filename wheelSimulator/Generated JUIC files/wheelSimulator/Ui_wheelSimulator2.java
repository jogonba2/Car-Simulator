/********************************************************************************
** Form generated from reading ui file 'wheelSimulator.jui'
**
** Created: sáb 3. may 03:03:39 2014
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package wheelSimulator;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_wheelSimulator2 implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction girDerAction;
    public QAction girIzqAction;
    public QAction runAction;
    public QAction frenAction;
    public QAction embAction;
    public QAction actionCambiar_regi_n;
    public QAction actionInterfaz_Movable;
    public QAction actionMover;
    public QAction actionActivar;
    public QAction actionDesactivar;
    public QAction actionVolante;
    public QAction actionVeloc_metro;
    public QAction actionFreno;
    public QAction actionAcelerador;
    public QAction actionMostrar;
    public QAction actionNoMostrar;
    public QWidget centralwidget;
    public QMenuBar menubar;
    public QGraphicsView qgv;
    public QMenu menuOpciones;
    public QMenu menuRadio;
    public QMenu menuActions;
    public QStatusBar statusbar;

    public Ui_wheelSimulator2() { super(); }

    public void setupUi(QMainWindow wheelSimulator)
    {
        wheelSimulator.setObjectName("wheelSimulator");
        wheelSimulator.resize(new QSize(800, 600).expandedTo(wheelSimulator.minimumSizeHint()));
        girDerAction = new QAction(wheelSimulator);
        girDerAction.setObjectName("girDerAction");
        girIzqAction = new QAction(wheelSimulator);
        girIzqAction.setObjectName("girIzqAction");
        runAction = new QAction(wheelSimulator);
        runAction.setObjectName("runAction");
        frenAction = new QAction(wheelSimulator);
        frenAction.setObjectName("frenAction");
        embAction = new QAction(wheelSimulator);
        embAction.setObjectName("embAction");
        actionCambiar_regi_n = new QAction(wheelSimulator);
        actionCambiar_regi_n.setObjectName("actionCambiar_regi_n");
        actionInterfaz_Movable = new QAction(wheelSimulator);
        actionInterfaz_Movable.setObjectName("actionInterfaz_Movable");
        actionMover = new QAction(wheelSimulator);
        actionMover.setObjectName("actionMover");
        actionActivar = new QAction(wheelSimulator);
        actionActivar.setObjectName("actionActivar");
        actionDesactivar = new QAction(wheelSimulator);
        actionDesactivar.setObjectName("actionDesactivar");
        actionVolante = new QAction(wheelSimulator);
        actionVolante.setObjectName("actionVolante");
        actionVeloc_metro = new QAction(wheelSimulator);
        actionVeloc_metro.setObjectName("actionVeloc_metro");
        actionFreno = new QAction(wheelSimulator);
        actionFreno.setObjectName("actionFreno");
        actionAcelerador = new QAction(wheelSimulator);
        actionAcelerador.setObjectName("actionAcelerador");
        actionMostrar = new QAction(wheelSimulator);
        actionMostrar.setObjectName("actionMostrar");
        actionNoMostrar = new QAction(wheelSimulator);
        actionNoMostrar.setObjectName("actionNoMostrar");
        centralwidget = new QWidget(wheelSimulator);
        centralwidget.setObjectName("centralwidget");
        wheelSimulator.setCentralWidget(centralwidget);
        menubar = new QMenuBar(wheelSimulator);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 800, 22));
        menuOpciones = new QMenu(menubar);
        menuOpciones.setObjectName("menuOpciones");
        menuRadio = new QMenu(menuOpciones);
        menuRadio.setObjectName("menuRadio");
        menuActions = new QMenu(menubar);
        menuActions.setObjectName("menuActions");
        wheelSimulator.setMenuBar(menubar);
        statusbar = new QStatusBar(wheelSimulator);
        statusbar.setObjectName("statusbar");
        wheelSimulator.setStatusBar(statusbar);

        menubar.addAction(menuActions.menuAction());
        menubar.addAction(menuOpciones.menuAction());
        menuOpciones.addAction(menuRadio.menuAction());
        menuRadio.addAction(actionActivar);
        menuRadio.addAction(actionDesactivar);
        menuRadio.addAction(actionMostrar);
        menuRadio.addAction(actionNoMostrar);
        menuActions.addAction(runAction);
        menuActions.addAction(embAction);
        menuActions.addAction(frenAction);
        menuActions.addAction(girIzqAction);
        menuActions.addAction(girDerAction);
        retranslateUi(wheelSimulator);

        wheelSimulator.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow wheelSimulator)
    {
        wheelSimulator.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "MainWindow", null));
        girDerAction.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "&GirDer", null));
        girDerAction.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", conf.keyDer, null));
        girIzqAction.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "&girIzq", null));
        girIzqAction.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", conf.keyIzq, null));
        runAction.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "&runAction", null));
        runAction.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", conf.keyRun, null));
        frenAction.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "&FrenAction", null));
        frenAction.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", conf.keyBrake, null));
        actionCambiar_regi_n.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "Cambiar regi\u00f3n", null));
        actionInterfaz_Movable.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "Interfaz Movable", null));
        actionMover.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "Mover", null));
        actionActivar.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "Activar", null));
        actionActivar.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", conf.actRadio, null));
        actionDesactivar.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "Desactivar", null));
        actionDesactivar.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", conf.deactRadio, null));
        actionVolante.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "Volante", null));
        actionVeloc_metro.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "Veloc\u00edmetro", null));
        actionFreno.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "Freno", null));
        actionAcelerador.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "Acelerador", null));
        actionMostrar.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "Mostrar", null));
        actionMostrar.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", conf.showRadio, null));
        actionNoMostrar.setText(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "No Mostrar", null));
        actionNoMostrar.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", conf.hideRadio, null));
        menuOpciones.setTitle(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "Opciones", null));
        menuRadio.setTitle(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "Radio", null));
        menuActions.setTitle(com.trolltech.qt.core.QCoreApplication.translate("wheelSimulator", "Actions", null));
    } // retranslateUi

}

