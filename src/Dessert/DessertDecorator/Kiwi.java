package Dessert.DessertDecorator;

import Dessert.Dessert;

public class Kiwi extends FruitDecorator {
    Dessert dessert;

    public Kiwi(Dessert dessert){
        this.dessert = dessert;
    }

    @Override
    public double cost() {
        return 0.85 + dessert.cost();
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Kiwi";
    }
}
