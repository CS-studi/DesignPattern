package main.ch1.duck;

import main.ch1.behavior.Impl.FlyWithWings;
import main.ch1.behavior.Impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("저건 물오리입니다.");
    }
}
