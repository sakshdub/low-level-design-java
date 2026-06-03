package mediator;

public class User {
    String name;
    public User(String name ){
        this.name=name;
    }
    public void sendMessage(String msg,User recipent){
        System.out.println(this.name + "sending msg to " + recipent.getName());
    }
    public String getName(){
        return name;
    }
}
