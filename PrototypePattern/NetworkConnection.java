import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String importantData;
    private List<String> domains;
    
    public List<String> getDomains() {
        return domains;
    }
    public void setDomains(List<String> domains) {
        this.domains = domains;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }
    public String getIp() {
        return ip;
    }
    public String getImportantData() {
        return importantData;
    }

    public void loadData() throws InterruptedException{
        this.importantData = "Very heavy data";
        domains = new ArrayList<String>();
        domains.add("gogle.com");
        domains.add("yaho.com");
        domains.add("facbook.com");
        Thread.sleep(3000);
    }
    @Override
    public String toString() {
        return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + ", domains=" + domains + "]";
    }


    //Shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //Deep copy implementation
    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    //     NetworkConnection conn = new NetworkConnection();
    //     conn.ip = this.ip;
    //     conn.importantData = this.importantData;
    //     conn.domains = new ArrayList();
    //     for (String d : this.domains) {
    //         conn.domains.add(d);
    //     }

    //     return conn;
    // }
    
    
}
