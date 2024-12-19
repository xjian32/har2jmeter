package org.hetc.jmx;

import org.apache.jmeter.control.TransactionController;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.property.StringProperty;

/**
 * @ClassName: SetTransactionController
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class SetTransactionController {

    public static TransactionController setTransactionController() {
        TransactionController transactionController = new TransactionController();
        transactionController.setGenerateParentSample(true);
        transactionController.setEnabled(true);
        transactionController.setName("事务管理器");
        transactionController.setIncludeTimers(false);
        transactionController.setProperty(new StringProperty(TestElement.GUI_CLASS, "org.apache.jmeter.control.gui.TransactionControllerGui"));
        transactionController.setProperty(new StringProperty(TestElement.TEST_CLASS, TransactionController.class.getName()));

        return transactionController;
    }
}
