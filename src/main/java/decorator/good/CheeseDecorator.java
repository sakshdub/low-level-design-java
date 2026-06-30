package decorator.good;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }
    public String getDescription(){
        return pizza.getDescription()+", Cheese";
    }
    public double getCost(){
        return pizza.getCost() + 50 ;
    }
}
