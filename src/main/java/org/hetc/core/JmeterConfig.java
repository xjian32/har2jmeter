package org.hetc.core;

import org.apache.jmeter.util.JMeterUtils;
import org.hetc.Main;

import java.io.File;
import java.util.Locale;

/**
 * @ClassName: JmeterConfig
 * @Author: Jaxx
 * @Date: 2024/12/19
 * @Description:
 **/
public class JmeterConfig {
    public void setJmeterHome() {
        String configPath = String.valueOf(new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent());
        configPath = configPath.substring(0, configPath.lastIndexOf(File.separator)) + "/jmeter";

        JMeterUtils.setJMeterHome(configPath);
        JMeterUtils.loadJMeterProperties(configPath + "/bin/jmeter.properties");
        JMeterUtils.setLocale(Locale.CHINA);
        JMeterUtils.initLocale();
    }

}
