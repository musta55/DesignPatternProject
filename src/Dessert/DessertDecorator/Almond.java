package Dessert.DessertDecorator;

import Dessert.Dessert;

public class Almond extends CondimentDecorator {
    Dessert dessert;

    public Almond(Dessert dessert){
        this.dessert = dessert;
    }

    @Override
    public double cost() {
        return 0.35 + dessert.cost();
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Almond";
    }
}
