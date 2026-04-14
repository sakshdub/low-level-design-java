package observer.concrete;

import observer.observer.Subscriber;

public class User2 implements Subscriber {

    public void update(String message){
        System.out.println(" received notification: "+message);
    }
}
