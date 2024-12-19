package org.hetc.jmx;

import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.property.BooleanProperty;
import org.apache.jmeter.testelement.property.StringProperty;
import org.apache.jmeter.threads.gui.ThreadGroupGui;
import org.apache.jmeter.threads.ThreadGroup;

/**
 * @ClassName: SetThreadGroup
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class SetThreadGroup {

    public static ThreadGroup setThreadGroup() {
        ThreadGroup threadGroup = new ThreadGroup();
        threadGroup.setName("线程组");
        threadGroup.setNumThreads(1);
        threadGroup.setRampUp(1);
        threadGroup.setDelay(0);
        threadGroup.setDuration(0);
        threadGroup.setProperty(new StringProperty(ThreadGroup.ON_SAMPLE_ERROR, "continue"));
        threadGroup.setScheduler(false);
        threadGroup.setProperty(TestElement.TEST_CLASS, ThreadGroup.class.getName());
        threadGroup.setProperty(TestElement.GUI_CLASS, ThreadGroupGui.class.getName());
        threadGroup.setProperty(new BooleanProperty(TestElement.ENABLED, true));

        return threadGroup;
    }

}
