package org.hetc.core;


import org.apache.commons.lang3.ObjectUtils;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.control.LoopController;
import org.apache.jmeter.protocol.http.control.HeaderManager;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.testelement.property.TestElementProperty;
import org.apache.jmeter.threads.ThreadGroup;
import org.apache.jorphan.collections.ListedHashTree;
import org.hetc.jmx.*;
import org.hetc.model.HarEntries;
import org.hetc.model.HarLog;
import org.hetc.utils.HarFileReader;
import org.hetc.utils.UrlUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: JmeterGenerater
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class JmeterFileGenerater {
    // private static final String LOCAL_JMETER_HOME = System.getProperty("user.dir") + "/jmeter";
    public void generateJmxFile(HarLog harLog, String jmxFileOutPutPath) {
        if (ObjectUtils.isEmpty(harLog)) {
            throw new RuntimeException("harLog is null");
        }
        List<HarEntries> entries = harLog.getEntries();
        if (ObjectUtils.isEmpty(entries)) {
            throw new RuntimeException("harLog entries is empty");
        }
        JmeterConfig jmeterConfig = new JmeterConfig();
        jmeterConfig.setJmeterHome();

        List<ListedHashTree> httpSamplerProxyList = new ArrayList<>();

        for (HarEntries harEntries : entries) {
            HTTPSamplerProxy jmeterBuilder = JmeterBuilderFactory.getJmeterBuilder(harEntries);

            HeaderManager headerManager = SetHeader.setHeader(harEntries.getRequest().getHeaders());
            ListedHashTree hashTreeHeaderManager = new ListedHashTree();
            hashTreeHeaderManager.add(headerManager);
            hashTreeHeaderManager.add(SetResponseAssertion.setResponseAssertion());

            ListedHashTree hashTreeHTTPSamplerProxy = new ListedHashTree();
            hashTreeHTTPSamplerProxy.add(jmeterBuilder, hashTreeHeaderManager);
            httpSamplerProxyList.add(hashTreeHTTPSamplerProxy);
        }

        ThreadGroup threadGroup = SetThreadGroup.setThreadGroup();
        LoopController loopController = SetLoopController.setLoopController();

        threadGroup.setProperty(new TestElementProperty(ThreadGroup.MAIN_CONTROLLER, loopController));
        ListedHashTree hashTreeThreadGroup = new ListedHashTree();
        ListedHashTree hashTreeTestPlan = new ListedHashTree();
        
        hashTreeTestPlan.add(SetCacheManager.setCacheManager());
        hashTreeTestPlan.add(SetCookieManager.setCookieManager());
        hashTreeTestPlan.add(SetDNSCacheManager.setDNSCacheManager());

        for (int i = 0; i < httpSamplerProxyList.size(); i++) {
            hashTreeThreadGroup.add(threadGroup, httpSamplerProxyList.get(i));
        }
        // 默认一次的请求地址domain都是相同的，所以只取了第一个
        String url = entries.get(0).getRequest().getUrl();
        UrlUtils urlUtils;
        try {
            urlUtils = new UrlUtils(url);
            Arguments userArguments = SetUserArguments.setArguments();
            userArguments.addArgument("BASE_URL", urlUtils.getDomain());
            hashTreeTestPlan.add(userArguments);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        hashTreeTestPlan.add(SetResultCollector.setResultCollector());
        hashTreeTestPlan.add(SetTestPlan.setTestPlan(), hashTreeThreadGroup);

        try {
            SaveService.saveTree(hashTreeTestPlan, new FileOutputStream(jmxFileOutPutPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String harFilePath = "/Users/jaxx/Downloads/charles.har";
        JmeterFileGenerater jmeterFileGenerater = new JmeterFileGenerater();
        try {
            jmeterFileGenerater.generateJmxFile(HarFileReader.readFile(harFilePath).getLog(), "/Users/jaxx/Downloads/ttttt3.jmx");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
