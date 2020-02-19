package FactoryMethodPattern.Concrete;

import FactoryMethodPattern.Abstract.Plan;

public class DomesticPlan extends Plan {
    @Override
    public void getRate() {
        rate = 3.50;
    }
}