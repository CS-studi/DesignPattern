package main.ch1.duck;

import main.ch1.behavior.Impl.FlyNoWay;
import main.ch1.behavior.Impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();

    }

    @Override
    public void display() {
        System.out.println("저건 모형 오리입니다");
    }

}
