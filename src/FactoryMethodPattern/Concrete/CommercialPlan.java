package FactoryMethodPattern.Concrete;


import FactoryMethodPattern.Abstract.Plan;

public class CommercialPlan extends Plan {
    @Override
    public void getRate() {
        rate = 7.50;
    }
}
