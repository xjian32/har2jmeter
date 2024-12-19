package org.hetc.model;
import java.util.List;

public class HarResponse {

    private int status;
    private HarContent content;
    private int bodySize;
    private int headersSize;
    private List<String> cookies;
    private String statusText;
    private List<HarHeaders> headers;
    private String httpVersion;
    private String redirectURL;
    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

    public void setContent(HarContent content) {
         this.content = content;
     }
     public HarContent getContent() {
         return content;
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

    public void setCookies(List<String> cookies) {
         this.cookies = cookies;
     }
     public List<String> getCookies() {
         return cookies;
     }

    public void setStatusText(String statusText) {
         this.statusText = statusText;
     }
     public String getStatusText() {
         return statusText;
     }

    public void setHeaders(List<HarHeaders> headers) {
         this.headers = headers;
     }
     public List<HarHeaders> getHeaders() {
         return headers;
     }

    public void setHttpVersion(String httpVersion) {
         this.httpVersion = httpVersion;
     }
     public String getHttpVersion() {
         return httpVersion;
     }

    public void setRedirectURL(String redirectURL) {
         this.redirectURL = redirectURL;
     }
     public String getRedirectURL() {
         return redirectURL;
     }

}