package observer;

import observer.concrete.User;
import observer.observer.Subscriber;
import observer.subject.Youtube;

public class Main {
    public static void main(String[] args) {
        Youtube youtube=new Youtube();
        Subscriber user1=new User("Alice");
        Subscriber user2=new User("Bob");
        youtube.subscribe(user1);
        youtube.subscribe(user2);
        youtube.uploadVidieo("New video uploaded!");
    }
}
