import Beverage.Beverage;
import Dessert.Dessert;
import Dessert.DessertDecorator.*;
import Dessert.DessertDecorator.NormalChocolate;
import Dessert.DessertDecorator.Strawberry;
import Dessert.DessertDecorator.WhiteChocolate;

// Receiver
public class Cook {
    public static String dessertType="";
    public static String beverageType="";
    public static String[] chocoList = null;
    public static String[] fruitList = null;
    public static String[] condimentList = null;
    Dessert dessert;
    Beverage beverage;
    public void getOrder(String factoryType){
        if(factoryType.equalsIgnoreCase("Dessert")){
            System.out.println(dessertType + " order received.");

            DessertFactory factory =  new DessertFactory();
            dessert = factory.makeDessert(dessertType);

            dessert.prepareDough(dessertType);
            dessert.cookDough(dessertType);
            dessert.dishUp(dessertType);
            dessert = decorate(chocoList, fruitList, condimentList);

            System.out.println(dessert.getDescription() + " order completed.");
            System.out.println("Cost: $" + dessert.cost());

        }
        else if(factoryType.equalsIgnoreCase("Beverage")){
            System.out.println(beverageType + " order received.");

            BeverageFactory factory = new BeverageFactory();
            beverage = factory.makeBeverage(beverageType);
            beverage.prepareBeverage();

            System.out.println(beverage.getDescription() + " order completed.");
            System.out.println("Cost: $" + beverage.cost());
        }
        System.out.println("");
    }

    public Dessert decorate(String[] chocoList, String[] fruitList, String[] condimentList){
        for (int i = 0; i < chocoList.length; i++) {
            String choco = chocoList[i];
            if(choco.equals("White")){
                dessert = new WhiteChocolate(dessert);
            }
            else if(choco.equals("Dark")){
                dessert = new NormalChocolate(dessert);
            }
        }

        for (int i = 0; i < fruitList.length; i++) {
            String fruit = fruitList[i];
            if(fruit.equals("Banana")){
                dessert = new Banana(dessert);
            }
            else if(fruit.equals("Strawberry")){
                dessert = new Strawberry(dessert);
            }
            else if(fruit.equals("Kiwi")){
                dessert = new Kiwi(dessert);
            }
        }

        for (int i = 0; i < condimentList.length; i++) {
            String condiment = condimentList[i];
            if(condiment.equals("Almond")){
                dessert = new Almond(dessert);
            }
            else if(condiment.equals("Coconut")){
                dessert = new Coconut(dessert);
            }
            else if(condiment.equals("Ice Cream")){
                dessert = new IceCream(dessert);
            }
        }
        return dessert;
    }
}
