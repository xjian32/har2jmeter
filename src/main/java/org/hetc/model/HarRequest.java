package org.hetc.model;
import java.util.List;

public class HarRequest {

    private String method;
    private int bodySize;
    private int headersSize;
    private List<HarCookies> cookies;
    private List<HarHeaders> headers;
    private List<HarQueryString> queryString;
    private String httpVersion;
    private String url;
    private HarPostData postData;

    public HarPostData getPostData() {
        return postData;
    }

    public void setPostData(HarPostData postData) {
        this.postData = postData;
    }
    public void setMethod(String method) {
         this.method = method;
     }
     public String getMethod() {
         return method;
     }


    public void setBodySize(int bodySize) {
         this.bodySize = bodySize;
     }
     public int getBodySize() {
         return bodySize;
     }

    public void setHeadersSize(int headersSize) {
         this.headersSize = headersSize;
     }
     public int getHeadersSize() {
         return headersSize;
     }

    public void setCookies(List<HarCookies> cookies) {
         this.cookies = cookies;
     }
     public List<HarCookies> getCookies() {
         return cookies;
     }

    public void setHeaders(List<HarHeaders> headers) {
         this.headers = headers;
     }
     public List<HarHeaders> getHeaders() {
         return headers;
     }

    public void setQueryString(List<HarQueryString> queryString) {
         this.queryString = queryString;
     }
     public List<HarQueryString> getQueryString() {
         return queryString;
     }

    public void setHttpVersion(String httpVersion) {
         this.httpVersion = httpVersion;
     }
     public String getHttpVersion() {
         return httpVersion;
     }

    public void setUrl(String url) {
         this.url = url;
     }
     public String getUrl() {
         return url;
     }

}