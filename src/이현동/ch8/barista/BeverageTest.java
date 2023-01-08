package ch8.barista;

public class BeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Making Tea");
        tea.preprareRecipe();

        System.out.println("Making Coffee");
        coffee.preprareRecipe();

        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
