package Dessert.DessertDecorator;

import Dessert.Dessert;

public class Banana extends FruitDecorator{
    Dessert dessert;

    public Banana(Dessert dessert){
        this.dessert = dessert;
    }

    @Override
    public double cost() {
        return 0.75 + dessert.cost();
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Banana";
    }
}
