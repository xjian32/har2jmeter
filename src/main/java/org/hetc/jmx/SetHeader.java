package org.hetc.jmx;

import org.apache.jmeter.protocol.http.control.Header;
import org.apache.jmeter.protocol.http.control.HeaderManager;
import org.apache.jmeter.protocol.http.gui.HeaderPanel;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.property.CollectionProperty;
import org.apache.jmeter.testelement.property.StringProperty;
import org.apache.jmeter.testelement.property.TestElementProperty;
import org.hetc.model.HarHeaders;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: SetHeader
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class SetHeader {

    public static HeaderManager setHeader(List<HarHeaders> harHeaders) {
        ArrayList<TestElementProperty> list2 = new ArrayList<>();
        HeaderManager headerManager = new HeaderManager();
        for (HarHeaders harHeader : harHeaders) {
            Header header = new Header();
            header.setProperty(new StringProperty("Header.name", harHeader.getName()));
            header.setProperty(new StringProperty("Header.value", harHeader.getValue()));
            TestElementProperty headerElement = new TestElementProperty("", header);
            list2.add(headerElement);
        }

        headerManager.setEnabled(true);
        headerManager.setProperty(new CollectionProperty("HeaderManager.headers", list2));
        headerManager.setProperty(new StringProperty("TestElement.test_class", HeaderManager.class.getName()));
        headerManager.setProperty(new StringProperty("TestElement.name", "HTTP Header Manager"));
        headerManager.setProperty(new StringProperty(TestElement.GUI_CLASS, HeaderPanel.class.getName()));
        return headerManager;
    }
}
