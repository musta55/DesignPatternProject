package Dessert.DessertDecorator;


import Dessert.Dessert;

public class Coconut extends CondimentDecorator{
    Dessert dessert;

    public Coconut(Dessert dessert){
        this.dessert = dessert;
    }

    @Override
    public double cost() {
        return 0.10 + dessert.cost();
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Coconut";
    }
}
