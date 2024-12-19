package org.hetc.jmx;

import org.apache.jmeter.assertions.ResponseAssertion;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.property.StringProperty;

/**
 * @ClassName: SetResponseAssertion
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class SetResponseAssertion {

    public static ResponseAssertion setResponseAssertion() {
        ResponseAssertion responseAssertion = new ResponseAssertion();
        responseAssertion.setName("响应断言");
        responseAssertion.setAssumeSuccess(true);
        responseAssertion.setTestFieldResponseCode();
        responseAssertion.setToEqualsType();
        responseAssertion.setCustomFailureMessage("注意：ResponseCode is not 200!");
        responseAssertion.addTestString("200");

        responseAssertion.setProperty(new StringProperty(TestElement.GUI_CLASS, "AssertionGui"));
        responseAssertion.setProperty(new StringProperty(TestElement.TEST_CLASS, ResponseAssertion.class.getName()));

        return responseAssertion;
    }
}
