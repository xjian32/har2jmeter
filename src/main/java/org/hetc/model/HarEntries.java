package org.hetc.model;
import java.util.Date;


public class HarEntries {

    private double time;
    private boolean _isHTTPS;
    private String _webSocketMessages;
    private String _remoteDeviceIP;
    private HarTimings timings;
    private String _serverAddress;
    private boolean _isIntercepted;
    private String _id;
    private String serverIPAddress;
    private String _name;
    private String _clientAddress;
    private String _clientBundlePath;
    private HarRequest request;
    private int _serverPort;
    private String _clientName;
    private int _clientPort;
    private HarResponse response;
    private String comment;
    private Date startedDateTime;
    private HarCache cache;

    public void setTime(double time) {
         this.time = time;
     }
    public double getTime() {
         return time;
     }

    public void set_isHTTPS(boolean _isHTTPS) {
         this._isHTTPS = _isHTTPS;
     }
    public boolean get_isHTTPS() {
         return _isHTTPS;
     }

    public void set_webSocketMessages(String _webSocketMessages) {
         this._webSocketMessages = _webSocketMessages;
     }
    public String get_webSocketMessages() {
         return _webSocketMessages;
     }

    public void set_remoteDeviceIP(String _remoteDeviceIP) {
         this._remoteDeviceIP = _remoteDeviceIP;
     }
    public String get_remoteDeviceIP() {
         return _remoteDeviceIP;
     }

    public void setTimings(HarTimings timings) {
         this.timings = timings;
     }
    public HarTimings getTimings() {
         return timings;
     }

    public void set_serverAddress(String _serverAddress) {
         this._serverAddress = _serverAddress;
     }
    public String get_serverAddress() {
         return _serverAddress;
     }

    public void set_isIntercepted(boolean _isIntercepted) {
         this._isIntercepted = _isIntercepted;
     }
    public boolean get_isIntercepted() {
         return _isIntercepted;
     }

    public void set_id(String _id) {
         this._id = _id;
     }
    public String get_id() {
         return _id;
     }

    public void setServerIPAddress(String serverIPAddress) {
         this.serverIPAddress = serverIPAddress;
     }
    public String getServerIPAddress() {
         return serverIPAddress;
     }

    public void set_name(String _name) {
         this._name = _name;
     }
    public String get_name() {
         return _name;
     }

    public void set_clientAddress(String _clientAddress) {
         this._clientAddress = _clientAddress;
     }
    public String get_clientAddress() {
         return _clientAddress;
     }

    public void set_clientBundlePath(String _clientBundlePath) {
         this._clientBundlePath = _clientBundlePath;
     }
    public String get_clientBundlePath() {
         return _clientBundlePath;
     }

    public void setRequest(HarRequest request) {
         this.request = request;
     }
    public HarRequest getRequest() {
         return request;
     }

    public void set_serverPort(int _serverPort) {
         this._serverPort = _serverPort;
     }
    public int get_serverPort() {
         return _serverPort;
     }

    public void set_clientName(String _clientName) {
         this._clientName = _clientName;
     }
    public String get_clientName() {
         return _clientName;
     }

    public void set_clientPort(int _clientPort) {
         this._clientPort = _clientPort;
     }
    public int get_clientPort() {
         return _clientPort;
     }

    public void setResponse(HarResponse response) {
         this.response = response;
     }
    public HarResponse getResponse() {
         return response;
     }

    public void setComment(String comment) {
         this.comment = comment;
     }
    public String getComment() {
         return comment;
     }

    public void setStartedDateTime(Date startedDateTime) {
         this.startedDateTime = startedDateTime;
     }
    public Date getStartedDateTime() {
         return startedDateTime;
     }

    public void setCache(HarCache cache) {
         this.cache = cache;
     }
    public HarCache getCache() {
         return cache;
    }

}