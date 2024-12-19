package org.hetc.core;

import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;
import org.apache.jmeter.testelement.property.BooleanProperty;
import org.apache.jmeter.testelement.property.StringProperty;
import org.hetc.model.HarEntries;
import org.hetc.utils.UrlUtils;

import java.net.MalformedURLException;

/**
 * @ClassName: AbsJmeterBuilder
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public abstract class AbsJmeterBuilder {

    public HTTPSamplerProxy build(HarEntries harEntries) {
        HTTPSamplerProxy httpSamplerProxy = new HTTPSamplerProxy();

        String url = harEntries.getRequest().getUrl();
        String method = harEntries.getRequest().getMethod();
        UrlUtils urlUtils;
        try {
            urlUtils = new UrlUtils(url);

            httpSamplerProxy.setName(method + "-" + urlUtils.getPath());
            httpSamplerProxy.setDomain("${BASE_URL}");
            httpSamplerProxy.setPort((urlUtils.getPort()) == -1 ? 80 : urlUtils.getPort());
            httpSamplerProxy.setProtocol(urlUtils.getProtocol());
            httpSamplerProxy.setProperty(new StringProperty("HTTPSampler.path", urlUtils.getPath()));
            httpSamplerProxy.setMethod(method);
            httpSamplerProxy.setProperty(new StringProperty("HTTPSampler.contentEncoding", "utf-8"));
            httpSamplerProxy.setProperty(new BooleanProperty("HTTPSampler.follow_redirects", true));
            httpSamplerProxy.setProperty(new BooleanProperty("HTTPSampler.auto_redirects", false));
            httpSamplerProxy.setProperty(new BooleanProperty("HTTPSampler.use_keepalive", true));
            httpSamplerProxy.setProperty(new BooleanProperty("HTTPSampler.DO_MULTIPART_POST", false));
            httpSamplerProxy.setProperty(new StringProperty("TestElement.gui_class", "org.apache.jmeter.protocol.http.control.gui.HttpTestSampleGui"));
            httpSamplerProxy.setProperty(new StringProperty("TestElement.test_class", "org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy"));
            httpSamplerProxy.setProperty(new StringProperty("TestElement.enabled", "true"));
            httpSamplerProxy.setProperty(new StringProperty("HTTPSampler.embedded_url_re", ""));
            httpSamplerProxy.setProperty(new StringProperty("HTTPSampler.connect_timeout", ""));
            httpSamplerProxy.setProperty(new StringProperty("HTTPSampler.response_timeout", ""));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return httpSamplerProxy;
    }
}
