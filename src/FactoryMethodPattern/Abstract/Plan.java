package FactoryMethodPattern.Abstract;

public abstract class Plan {
    protected double rate;

    public abstract void getRate();

    public void caculateBill(int units){
        System.out.println(units*rate);
    }
}
