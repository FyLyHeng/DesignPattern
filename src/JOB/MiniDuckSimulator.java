package JOB;


import JOB.DUCK.Duck;
import JOB.DUCK.MallardDuck;
import JOB.DUCK.ModelDuck;
import JOB.fly.FlyRocketPowerd;


public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();

        model.performFly();//show cant fly becos we have set it in constructor ready

        model.setFlyBehavior(new FlyRocketPowerd());// we set new behavior to model, it override the default fly behavior (cant fly)
        model.performFly();
    }
}
