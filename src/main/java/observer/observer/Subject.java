package observer.observer;

public interface Subject {
    public void subscribe(Subscriber subscriber);
    public void unsubscribe(Subscriber subscriber);
    public void notifySubscriber(String message);
}
