package org.hetc.model;


public class HarContent {

    private int size;
    private String mimeType;
    private String encoding;
    private String text;
    public void setSize(int size) {
         this.size = size;
     }
    public int getSize() {
         return size;
     }

    public void setMimeType(String mimeType) {
         this.mimeType = mimeType;
     }
    public String getMimeType() {
         return mimeType;
     }

    public void setEncoding(String encoding) {
         this.encoding = encoding;
     }
    public String getEncoding() {
         return encoding;
     }

    public void setText(String text) {
         this.text = text;
     }
    public String getText() {
         return text;
     }

}