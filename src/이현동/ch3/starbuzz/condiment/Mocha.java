package main.ch3.starbuzz.condiment;

import main.ch3.starbuzz.beverage.Beverage;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }

}
