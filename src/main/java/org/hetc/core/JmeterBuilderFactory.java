package org.hetc.core;


import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;
import org.hetc.model.HarEntries;
import org.apache.commons.lang3.ObjectUtils;


/**
 * @ClassName: JmeterBuilderFactory
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class JmeterBuilderFactory {

    private static JmeterRowBuilder jmeterRowBuilder;
    private static JmeterFormBuilder jmeterFormBuilder;

    public static HTTPSamplerProxy getJmeterBuilder(HarEntries harEntries) {

        String method = harEntries.getRequest().getMethod().toUpperCase();
        if (method.equals("GET")) {
            if (ObjectUtils.isEmpty(jmeterFormBuilder)) {
                jmeterFormBuilder = new JmeterFormBuilder();
            }
            return jmeterFormBuilder.build(harEntries);
        } else if (method.equals("POST") || method.equals("PUT") || method.equals("DELETE")) {
            if (ObjectUtils.isEmpty(jmeterRowBuilder)) {
                jmeterRowBuilder = new JmeterRowBuilder();
            }
            return jmeterRowBuilder.build(harEntries);
        } else {
            throw new RuntimeException("不支持的请求类型：" + method);
        }
    }
}

// public class JmeterBuilderFactory {
//
//     private static JmeterRowBuilder jmeterRowBuilder;
//     private static JmeterFormBuilder jmeterFormBuilder;
//
//     public static HTTPSamplerProxy getJmeterBuilder(HarEntries harEntries) {
//
//         String method = harEntries.getRequest().getMethod();
//         if (method.equals("POST") || method.equals("PUT") || method.equals("DELETE")) {
//             if (ObjectUtils.isEmpty(jmeterRowBuilder)) {
//                 jmeterRowBuilder = new JmeterRowBuilder();
//             }
//             return jmeterRowBuilder.build(harEntries);
//         } else {
//             throw new RuntimeException("不支持的请求类型：" + method);
//         }
//     }
// }