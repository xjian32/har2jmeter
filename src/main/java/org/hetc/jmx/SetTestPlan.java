package org.hetc.jmx;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.control.gui.TestPlanGui;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.TestPlan;
import org.apache.jmeter.testelement.property.BooleanProperty;
import org.apache.jmeter.testelement.property.StringProperty;
import org.apache.jmeter.testelement.property.TestElementProperty;

/**
 * @ClassName: SetTestPlan
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class SetTestPlan {

    public static TestPlan setTestPlan() {
        TestPlan testPlan = new TestPlan();
        testPlan.setFunctionalMode(false);
        testPlan.setSerialized(false);
        testPlan.setTearDownOnShutdown(true);
        testPlan.setProperty(TestElement.TEST_CLASS, TestPlan.class.getName());
        testPlan.setProperty(TestElement.GUI_CLASS, TestPlanGui.class.getName());
        testPlan.setProperty(new BooleanProperty(TestElement.ENABLED, true));
        testPlan.setProperty(new StringProperty(TestElement.COMMENTS, ""));
        testPlan.setProperty(new StringProperty("TestPlan.user_defined_classpath", ""));
        testPlan.setTestPlanClasspath("");
        Arguments arguments = new Arguments();
        testPlan.setProperty(new TestElementProperty("TestPlan.user_defined_variables", arguments));

        return testPlan;
    }
}
