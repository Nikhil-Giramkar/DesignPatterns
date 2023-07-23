import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements ISubject{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<IObserver> listOfSubscribers = new ArrayList<>();

    private List<String> listOfVideoTitles = new ArrayList<>();
    
    public List<String> getListOfVideoTitles() {
        return listOfVideoTitles;
    }

    public void addNewVideo(String videoTitle) {
        listOfVideoTitles.add(videoTitle);
        notifyAboutNewVideo(videoTitle);
    }

    @Override
    public void subscribe(IObserver ob) {
        this.listOfSubscribers.add(ob);
    }

    @Override
    public void unSubscribe(IObserver ob) {
        this.listOfSubscribers.remove(ob);
    }

    @Override
    public void notifyAboutNewVideo(String title) {
        for (IObserver subscriber : listOfSubscribers) {
           subscriber.notified(this.name, title);
        }
    }
    
}
