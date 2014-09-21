/********************************************************************************
** Form generated from reading ui file 'records.jui'
**
** Created: sáb 3. may 13:05:56 2014
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

package wheelSimulator;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_records implements com.trolltech.qt.QUiForm<QWidget>
{
    public QGraphicsView graphicsView;

    public Ui_records() { super(); }

    public void setupUi(QWidget records)
    {
        records.setObjectName("records");
        records.resize(new QSize(700, 561).expandedTo(records.minimumSizeHint()));
        graphicsView = new QGraphicsView(records);
        graphicsView.setObjectName("graphicsView");
        graphicsView.setGeometry(new QRect(0, 0, 701, 561));
        retranslateUi(records);

        records.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget records)
    {
        records.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("records", "Form", null));
    } // retranslateUi

}

