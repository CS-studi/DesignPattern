package main.ch3.starbuzz.coffee;

import main.ch3.starbuzz.beverage.Beverage;

public class HouseBlend extends Beverage {
    String description;

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
