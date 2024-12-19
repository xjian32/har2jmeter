package org.hetc.model;

public class HarTimings {

    private int connect;
    private int send;
    private int dns;
    private int ssl;
    private int wait;
    private int blocked;
    private int receive;
    public void setConnect(int connect) {
         this.connect = connect;
     }
     public int getConnect() {
         return connect;
     }

    public void setSend(int send) {
         this.send = send;
     }
     public int getSend() {
         return send;
     }

    public void setDns(int dns) {
         this.dns = dns;
     }
     public int getDns() {
         return dns;
     }

    public void setSsl(int ssl) {
         this.ssl = ssl;
     }
     public int getSsl() {
         return ssl;
     }

    public void setWait(int wait) {
         this.wait = wait;
     }
     public int getWait() {
         return wait;
     }

    public void setBlocked(int blocked) {
         this.blocked = blocked;
     }
     public int getBlocked() {
         return blocked;
     }

    public void setReceive(int receive) {
         this.receive = receive;
     }
     public int getReceive() {
         return receive;
     }

}