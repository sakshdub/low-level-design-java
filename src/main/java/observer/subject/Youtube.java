package observer.subject;

import observer.observer.Subject;
import observer.observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject {
    List<Subscriber>subscribers;
    public Youtube(){
        this.subscribers=new ArrayList<>();
    }
    public void subscribe(Subscriber subscribe){
        subscribers.add(subscribe);
    }
    public void unsubscribe(Subscriber subscribe){
        subscribers.remove(subscribe);
    }
    public void notifySubscriber(String message){
        for(Subscriber subscriber:subscribers){
            subscriber.update(message);
        }
    }
    public void uploadVidieo(String vedio){
        System.out.println("New Video Uploaded: " + vedio);
        notifySubscriber(vedio);
    }
}
