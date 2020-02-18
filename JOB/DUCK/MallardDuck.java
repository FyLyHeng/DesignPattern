package DUCK;

import Quack.Quack;
import fly.FlyWithWings;

public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

    @Override
    public void swim() {

    }

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

}
