package decorator.good;

public class Main {
    public static void main(String[] args) {
        Pizza pizza=new BasicPizza();
        pizza=new CheeseDecorator(pizza);
        pizza=new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
