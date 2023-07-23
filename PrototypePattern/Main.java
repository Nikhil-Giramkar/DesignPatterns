
/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        NetworkConnection conn1 = new NetworkConnection();
        conn1.setIp("localhost");
        //First object will Take time
        conn1.loadData();
       
        NetworkConnection conn2 = null;
        try{
            //Second object is cloned instantly
            conn2 = (NetworkConnection) conn1.clone();

            System.out.println(conn1);
            conn1.getDomains().remove(0);
            //removing element from object also removed from other
            System.out.println(conn1);
            System.out.println(conn2);
        }
        catch(Exception e){

        }
    }
}