package org.hetc.model;

/**
 * @ClassName: HarPostData @Author: Jaxx @Date: 2024/12/10 @Description:
 */
public class HarPostData {
    private HarParams[] params;
    private String text;
    private String mimeType;

    public HarParams[] getParams() {
        return params;
    }

    public void setParams(HarParams[] params) {
        this.params = params;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
}
