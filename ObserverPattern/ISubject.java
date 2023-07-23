public interface ISubject{

    void subscribe(IObserver ob);
    void unSubscribe(IObserver ob);
    void notifyAboutNewVideo(String videoTitle);
    String getName();
}