package main.ch1.behavior.Impl;

import main.ch1.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
