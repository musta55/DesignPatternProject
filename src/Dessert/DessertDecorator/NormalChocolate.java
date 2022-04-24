package Dessert.DessertDecorator;

import Dessert.Dessert;

public class NormalChocolate extends ChocolateDecorator{
    Dessert dessert;

    public NormalChocolate(Dessert dessert){
        this.dessert = dessert;
    }

    @Override
    public double cost() {
        return 1.25 + dessert.cost();
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Chocolate";
    }
}
