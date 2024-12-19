package org.hetc.jmx;

import org.apache.jmeter.protocol.http.control.CacheManager;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.property.StringProperty;

/**
 * @ClassName: SetCacheManager
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class SetCacheManager {

    public static CacheManager setCacheManager() {
        CacheManager cacheManager = new CacheManager();
        cacheManager.setMaxSize(5000);
        cacheManager.setUseExpires(true);
        cacheManager.setClearEachIteration(false);
        cacheManager.setControlledByThread(false);
        cacheManager.setName("HTTP缓存管理器");
        cacheManager.setProperty(new StringProperty(TestElement.GUI_CLASS, "org.apache.jmeter.protocol.http.gui.CacheManagerGui"));
        cacheManager.setProperty(new StringProperty(TestElement.TEST_CLASS, CacheManager.class.getName()));

        return cacheManager;
    }
}
