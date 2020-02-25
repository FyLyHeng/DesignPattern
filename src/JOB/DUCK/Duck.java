package JOB.DUCK;

import JOB.Quack.QuackBehavior;
import JOB.fly.FlyBehavior;

public abstract class Duck {

    /**
     * constructor
     */
    public Duck() {
    }


    /**
     * create obj of interface
     * @Delegate two interface
     * those two obj all sub class can call
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("All duck float, even decoys!");
    }


    /**
     * abstract method sub must override
     */
    public abstract void display();




    /**
     * @Delegate to the behavior class
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }


    /**
     * @Setting behavior dynamically
     * set by subclass that extend Duck
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
