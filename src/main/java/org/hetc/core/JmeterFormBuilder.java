package org.hetc.core;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;
import org.apache.jmeter.protocol.http.util.HTTPArgument;
import org.hetc.model.HarEntries;
import org.hetc.model.HarQueryString;

import java.util.List;

/**
 * @ClassName: JmeterFormBuilder
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class JmeterFormBuilder extends AbsJmeterBuilder {
    @Override
    public HTTPSamplerProxy build(HarEntries harEntries) {

        HTTPSamplerProxy build = super.build(harEntries);

        Arguments arguments = new Arguments();
        List<HarQueryString> queryString = harEntries.getRequest().getQueryString();

        HTTPArgument argument;
        for (HarQueryString harQueryString : queryString) {
            argument = new HTTPArgument();
            argument.setName(harQueryString.getName());
            argument.setValue(harQueryString.getValue());
            argument.setEnabled(true);
            argument.setMetaData("=");
            argument.setAlwaysEncoded(false);
            argument.setUseEquals(true);
            arguments.addArgument(argument);
        }
        build.setArguments(arguments);

        return build;
    }
}
