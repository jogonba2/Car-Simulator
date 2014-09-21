/********************************************************************************
** Form generated from reading ui file 'saveRecord.jui'
**
** Created: dom 4. may 04:53:55 2014
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package wheelSimulator;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_saveRecord implements com.trolltech.qt.QUiForm<QWidget>
{
    public QWidget widget;
    public QVBoxLayout verticalLayout_2;
    public QLabel label_2;
    public QSpacerItem verticalSpacer;
    public QVBoxLayout verticalLayout;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label;
    public QLineEdit nameLineEdit;
    public QSpacerItem verticalSpacer_2;
    public QHBoxLayout horizontalLayout;
    public QPushButton savePushButton;
    public QPushButton noSavePushButton;

    public Ui_saveRecord() { super(); }

    public void setupUi(QWidget saveRecord)
    {
        saveRecord.setObjectName("saveRecord");
        saveRecord.resize(new QSize(372, 170).expandedTo(saveRecord.minimumSizeHint()));
        widget = new QWidget(saveRecord);
        widget.setObjectName("widget");
        widget.setGeometry(new QRect(0, 0, 371, 171));
        verticalLayout_2 = new QVBoxLayout(widget);
        verticalLayout_2.setObjectName("verticalLayout_2");
        label_2 = new QLabel(widget);
        label_2.setObjectName("label_2");

        verticalLayout_2.addWidget(label_2);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        verticalLayout_2.addItem(verticalSpacer);

        verticalLayout = new QVBoxLayout();
        verticalLayout.setObjectName("verticalLayout");
        horizontalLayout_2 = new QHBoxLayout();
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label = new QLabel(widget);
        label.setObjectName("label");

        horizontalLayout_2.addWidget(label);

        nameLineEdit = new QLineEdit(widget);
        nameLineEdit.setObjectName("nameLineEdit");

        horizontalLayout_2.addWidget(nameLineEdit);


        verticalLayout.addLayout(horizontalLayout_2);

        verticalSpacer_2 = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        verticalLayout.addItem(verticalSpacer_2);

        horizontalLayout = new QHBoxLayout();
        horizontalLayout.setObjectName("horizontalLayout");
        savePushButton = new QPushButton(widget);
        savePushButton.setObjectName("savePushButton");

        horizontalLayout.addWidget(savePushButton);

        noSavePushButton = new QPushButton(widget);
        noSavePushButton.setObjectName("noSavePushButton");

        horizontalLayout.addWidget(noSavePushButton);


        verticalLayout.addLayout(horizontalLayout);


        verticalLayout_2.addLayout(verticalLayout);

        retranslateUi(saveRecord);

        saveRecord.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget saveRecord)
    {
        saveRecord.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("saveRecord", "Form", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("saveRecord", "                                   !Has logrado un nuevo record!", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("saveRecord", "Nombre", null));
        savePushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("saveRecord", "Guardar", null));
        noSavePushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("saveRecord", "No guardar", null));
    } // retranslateUi

}

