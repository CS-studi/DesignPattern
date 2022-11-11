package main.ch3.starbuzz.beverage;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setDescription(String description) {
        this.description = description;
    }
}
