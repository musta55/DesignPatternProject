import Dessert.*;

public class DessertFactory implements  Factory{
    public void specs(String factoryItem) {
        System.out.println("Factory item is dessert");
    }
    public Dessert makeDessert(String dessertType) {


         if(dessertType.equals("Pudding Dessert")){
            return new Pudding();
        }
        else if(dessertType.equals("Custard Dessert")){
            return new Custards();
        }

        else if (dessertType.equals(null)){
            return new Dessert() {
                @Override
                public double cost() {
                    return 0;
                }
            };
        }


        return null;
    }

}
