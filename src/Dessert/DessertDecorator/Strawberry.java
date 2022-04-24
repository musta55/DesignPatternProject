package Dessert.DessertDecorator;

import Dessert.Dessert;

public class Strawberry extends FruitDecorator {
    Dessert dessert;

    public Strawberry(Dessert dessert){
        this.dessert = dessert;
    }

    @Override
    public double cost() {
        return 0.60 + dessert.cost();
    }

    @Override
    public String getDescription() {
        return dessert.getDescription() + ", Strawberry";
    }
}
