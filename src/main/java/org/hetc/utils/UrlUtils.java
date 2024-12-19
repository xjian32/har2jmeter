package org.hetc.utils;


import cn.hutool.core.util.URLUtil;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: UrlUtils
 * @Author: Jaxx
 * @Date: 2024/12/18
 * @Description:
 **/
public class UrlUtils {

    private String url;


    public UrlUtils(String url) throws MalformedURLException {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public URL getUrlObj() throws MalformedURLException {
        return new URL(url);
    }

    public String getDomain() throws MalformedURLException {
        return getUrlObj().getHost();
    }

    public String getPath() throws MalformedURLException {
        return getUrlObj().getPath();
    }

    public String getQuery() throws MalformedURLException {
        return getUrlObj().getQuery();
    }

    public String getProtocol() throws MalformedURLException {
        return getUrlObj().getProtocol();
    }

    public int getPort() throws MalformedURLException {
        return getUrlObj().getPort();
    }

    public Map<String, String> getQueryParams() throws MalformedURLException {
        Map<String, String> map = new HashMap<>();

        String query = getQuery();
        String[] splitQuery = query.split("&");
        Arrays.stream(splitQuery)
                .forEach(
                        s -> {
                            s = URLUtil.decode(s);
                            String[] split = s.split("=");
                            map.put(split[0], split[1]);
                        });

        return map;
    }
}
