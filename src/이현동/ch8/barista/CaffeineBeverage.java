package ch8.barista;

public abstract class CaffeineBeverage {

    final void preprareRecipe(){
        boilWater();
        brew();
        pourIncup();
        addCondiment();
    }

    abstract void brew();
    abstract void addCondiment();

    void boilWater(){
        System.out.println("Boiling Water");
    }

    void pourIncup(){
        System.out.println("puring into cup");
    }

}
