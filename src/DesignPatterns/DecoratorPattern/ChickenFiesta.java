package DesignPatterns.DecoratorPattern;

public class ChickenFiesta extends Pizza
{
    public ChickenFiesta() {
        description = "ChickenFiesta";
    }

    public int getCost() {
        return 200;
    }
}
