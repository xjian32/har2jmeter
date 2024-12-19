package org.hetc.core;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;
import org.apache.jmeter.protocol.http.util.HTTPArgument;
import org.apache.jmeter.testelement.property.BooleanProperty;
import org.apache.jmeter.testelement.property.CollectionProperty;
import org.apache.jmeter.testelement.property.StringProperty;
import org.apache.jmeter.testelement.property.TestElementProperty;
import org.hetc.model.HarEntries;
import org.hetc.model.HarPostData;

import java.util.ArrayList;

/**
 * @ClassName: JmeterRowBuilder
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class JmeterRowBuilder extends AbsJmeterBuilder {

    @Override
    public HTTPSamplerProxy build(HarEntries harEntries) {

        HTTPSamplerProxy build = super.build(harEntries);
        build.setProperty(new BooleanProperty("HTTPSampler.postBodyRaw", true));

        Arguments HTTPsamplerArguments = new Arguments();

        HTTPArgument httpArgument = new HTTPArgument();
        HarPostData harPostData = harEntries.getRequest().getPostData();
        if (harPostData != null) {
            String requestBody = harPostData.getText();
            httpArgument.setProperty(new BooleanProperty("HTTPArgument.always_encode", false));

            httpArgument.setProperty(new StringProperty("Argument.value", requestBody));
            httpArgument.setProperty(new StringProperty("Argument.metadata", "="));
            ArrayList<TestElementProperty> list = new ArrayList<>();
            list.add(new TestElementProperty("", httpArgument));
            HTTPsamplerArguments.setProperty(new CollectionProperty("Arguments.arguments", list));
        }
        build.setProperty(new TestElementProperty("HTTPsampler.Arguments", HTTPsamplerArguments));

        return build;
    }
}
