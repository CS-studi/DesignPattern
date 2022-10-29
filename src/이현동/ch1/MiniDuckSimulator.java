package main.ch1;

import main.ch1.behavior.Impl.FlyRocketPowered;
import main.ch1.duck.Duck;
import main.ch1.duck.MallardDuck;
import main.ch1.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
