package Dessert.DessertDecorator;

import Dessert.Dessert;

public class IceCream extends CondimentDecorator {
    Dessert dessert;

    public IceCream(Dessert dessert){
        this.dessert = dessert;
    }

    @Override
    public double cost() {
        return 2.5 + dessert.cost();
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Ice Cream";
    }
}
