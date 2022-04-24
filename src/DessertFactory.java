import Dessert.*;

public class DessertFactory {

    public Dessert makeDessert(String dessertType) {
        if (dessertType.equals(null)){
            return null;
        }
        else if(dessertType.equals("Pudding Dessert")){
            return new Pudding();
        }
        else if(dessertType.equals("Custard Dessert")){
            return new Custards();
        }
        return null;
    }

}
