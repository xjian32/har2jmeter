package org.hetc.jmx;

import org.apache.jmeter.protocol.http.control.DNSCacheManager;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.property.StringProperty;

/**
 * @ClassName: SetDNSCacheManager
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class SetDNSCacheManager {
    public static DNSCacheManager setDNSCacheManager() {
        DNSCacheManager dnsCacheManager = new DNSCacheManager();
        dnsCacheManager.setEnabled(true);
        dnsCacheManager.setName("DNS缓存管理器");
        dnsCacheManager.setClearEachIteration(false);
        dnsCacheManager.setCustomResolver(false);
        dnsCacheManager.setProperty(new StringProperty(TestElement.GUI_CLASS, "org.apache.jmeter.protocol.http.gui.DNSCachePanel"));
        dnsCacheManager.setProperty(new StringProperty(TestElement.TEST_CLASS, DNSCacheManager.class.getName()));

        return dnsCacheManager;
    }
}
