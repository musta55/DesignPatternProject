//Concrete Component

package Dessert;

public class Custards extends Dessert {
    public Custards(){
        description = "Custard Dessert";
    }

    @Override
    public double cost() {
        return 4.00;
    }
}
