package org.hetc.jmx;

import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.samplers.SampleSaveConfiguration;
import org.apache.jmeter.testelement.property.BooleanProperty;
import org.apache.jmeter.testelement.property.ObjectProperty;
import org.apache.jmeter.testelement.property.StringProperty;

/**
 * @ClassName: SetResultCollector
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class SetResultCollector {

    public static ResultCollector setResultCollector() {
        ResultCollector resultCollector = new ResultCollector();

        SampleSaveConfiguration sampleSaveConfiguration = new SampleSaveConfiguration();
        sampleSaveConfiguration.setTime(true);
        sampleSaveConfiguration.setLatency(true);
        sampleSaveConfiguration.setTimestamp(true);
        sampleSaveConfiguration.setSuccess(true);
        sampleSaveConfiguration.setLabel(true);
        sampleSaveConfiguration.setCode(true);
        sampleSaveConfiguration.setMessage(true);
        sampleSaveConfiguration.setThreadName(true);
        sampleSaveConfiguration.setDataType(true);
        sampleSaveConfiguration.setEncoding(false);
        sampleSaveConfiguration.setAssertions(true);
        sampleSaveConfiguration.setSubresults(true);
        sampleSaveConfiguration.setResponseData(false);
        sampleSaveConfiguration.setSamplerData(false);
        sampleSaveConfiguration.setAsXml(false);
        sampleSaveConfiguration.setFieldNames(true);
        sampleSaveConfiguration.setResponseHeaders(false);
        sampleSaveConfiguration.setRequestHeaders(false);
        sampleSaveConfiguration.setAssertionResultsFailureMessage(true);
        sampleSaveConfiguration.setBytes(true);
        sampleSaveConfiguration.setSentBytes(true);
        sampleSaveConfiguration.setUrl(true);
        sampleSaveConfiguration.setThreadCounts(true);
        sampleSaveConfiguration.setIdleTime(true);
        sampleSaveConfiguration.setConnectTime(true);

        // resultCollector.setName("查看结果树");
        resultCollector.setProperty(new BooleanProperty("ResultCollector.error_logging", false));
        // 例子中使用的是new SampleSaveConfiguration()
        resultCollector.setProperty(new ObjectProperty("saveConfig", sampleSaveConfiguration));
        resultCollector.setProperty(new StringProperty("TestElement.gui_class", "org.apache.jmeter.visualizers.ViewResultsFullVisualizer"));
        resultCollector.setProperty(new StringProperty("TestElement.name", "View Results Tree"));
        resultCollector.setProperty(new StringProperty("TestElement.enabled", "true"));
        resultCollector.setProperty(new StringProperty("filename", ""));

        return resultCollector;
    }
}
