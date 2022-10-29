package main.ch1.behavior.Impl;

import main.ch1.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("삑");
    }
}
