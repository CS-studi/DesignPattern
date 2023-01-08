package ch8.barista;

public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiment() {
        System.out.println("Add Sugar and Milk");
    }
}
