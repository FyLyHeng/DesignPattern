package JOB.DUCK;

import JOB.Quack.Quack;
import JOB.fly.FlyWithWings;


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
