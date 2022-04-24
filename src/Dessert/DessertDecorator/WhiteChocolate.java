package Dessert.DessertDecorator;

import Dessert.Dessert;

public class WhiteChocolate extends ChocolateDecorator {
    Dessert dessert;

    public WhiteChocolate(Dessert dessert){
        this.dessert = dessert;
    }

    @Override
    public double cost() {
        return 1.50 + dessert.cost();
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", White Chocolate";
    }
}
