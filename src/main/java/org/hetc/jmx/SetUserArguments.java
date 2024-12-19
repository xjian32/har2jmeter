package org.hetc.jmx;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.property.StringProperty;

/**
 * @ClassName: SetUserArguments
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class SetUserArguments {

    public static Arguments setArguments() {
        Arguments arguments = new Arguments();
        arguments.setEnabled(true);
        arguments.setName("用户自定义参数");
        arguments.setProperty(new StringProperty(TestElement.GUI_CLASS, "org.apache.jmeter.config.gui.ArgumentsPanel"));
        arguments.setProperty(new StringProperty(TestElement.TEST_CLASS, Arguments.class.getName()));

        return arguments;
    }
}
