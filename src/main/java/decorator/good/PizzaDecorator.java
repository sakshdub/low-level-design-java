package decorator.good;

public abstract class PizzaDecorator implements Pizza{
    protected Pizza pizza;
    PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }

}
