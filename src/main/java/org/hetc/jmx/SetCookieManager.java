package org.hetc.jmx;

import org.apache.jmeter.protocol.http.control.CookieManager;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.property.StringProperty;

/**
 * @ClassName: SetCookieManager
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class SetCookieManager {

    public static CookieManager setCookieManager() {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setEnabled(true);
        cookieManager.setName("HTTP Cookie管理器");
        cookieManager.setClearEachIteration(false);
        cookieManager.setCookiePolicy("org.apache.jmeter.protocol.http.control.CookieManager.DEFAULT");
        cookieManager.setProperty(new StringProperty(TestElement.GUI_CLASS, "org.apache.jmeter.protocol.http.gui.CookiePanel"));
        cookieManager.setProperty(new StringProperty(TestElement.TEST_CLASS, CookieManager.class.getName()));

        return cookieManager;
    }
}
