package ch8.barista;

public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Dripping tea with teapot");
    }

    @Override
    void addCondiment() {
        System.out.println("Add Lemon in it");
    }
}
