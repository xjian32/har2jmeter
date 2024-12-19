package org.hetc.model;
import java.util.List;

public class HarLog {

    private String version;
    private HarCreator creator;
    private List<HarEntries> entries;
    public void setVersion(String version) {
         this.version = version;
     }
     public String getVersion() {
         return version;
     }

    public void setCreator(HarCreator creator) {
         this.creator = creator;
     }
     public HarCreator getCreator() {
         return creator;
     }

    public void setEntries(List<HarEntries> entries) {
         this.entries = entries;
     }
     public List<HarEntries> getEntries() {
         return entries;
     }

}