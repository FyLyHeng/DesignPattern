package JOB.DUCK;

import JOB.Quack.Quack;
import JOB.fly.FlyNoWay;


public class ModelDuck extends Duck {


    /**
     * constructor that do delegate
     */
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
