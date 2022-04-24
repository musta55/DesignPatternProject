//Concrete Component

package Dessert;

public class Pudding extends Dessert {
    public Pudding(){
        description = "Pudding Dessert";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
