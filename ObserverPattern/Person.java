public class Person implements IObserver{

    public Person(String name){
        this.name = name;
    }
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void notified(String channelName, String videoTitle) {
        System.out.println("\n"+this.name + " received notification from channel: "+channelName+" Video: "+videoTitle);
    }
    
}
