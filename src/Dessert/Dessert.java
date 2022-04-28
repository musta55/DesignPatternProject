// Component

package Dessert;

public abstract class Dessert {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareDough(String type) {
        System.out.println("Preparing "+ type + " milk");
    }

    public void cookDough(String type) {
        System.out.println("Cooking " + type + " milk");
    }

    public void dishUp(String type) {
        System.out.println("Put " + type + " on the dish");
    }
}
