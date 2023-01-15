package ch9.iterator.dinnermergercafe;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;


    public MenuItem(String name, String desc, boolean vegetarian, double price){
        this.name = name;
        this.description = desc;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return description;
    }


    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

}
