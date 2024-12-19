package org.hetc.jmx;

import org.apache.jmeter.control.LoopController;
import org.apache.jmeter.testelement.property.StringProperty;

/**
 * @ClassName: SetLoopController
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class SetLoopController {

    public static LoopController setLoopController() {
        LoopController loopController = new LoopController();
        loopController.setLoops(0);
        loopController.setContinueForever(false);
        loopController.setEnabled(true);
        loopController.setProperty(new StringProperty("TestElement.gui_class", "org.apache.jmeter.control.gui.LoopControlPanel"));
        loopController.setProperty(new StringProperty("TestElement.test_class", "org.apache.jmeter.control.LoopController"));
        loopController.setProperty(new StringProperty("TestElement.name", "Loop Controller"));
        loopController.setProperty(new StringProperty("LoopController.loops", "1"));

        return loopController;
    }
}
