package DesignPatterns.DecoratorPattern;

public class Barbeque extends ToppingsDecorator
{
    Pizza pizza;
    public Barbeque(Pizza pizza) {  this.pizza = pizza;  }

    public String getDescription() {
        if(pizza != null) {
            return pizza.getDescription();
        }
        System.out.print("No pizza ordered!!!");
        return "";
    }

    public int getCost() {
        if(pizza != null){
            return 90 + pizza.getCost();
        }
        return 0;
    }
}