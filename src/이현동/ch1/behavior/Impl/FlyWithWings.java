package main.ch1.behavior.Impl;

import main.ch1.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고 있어요!");
    }
}
