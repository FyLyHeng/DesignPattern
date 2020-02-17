package FactoryMethodPattern.Concrete;

import FactoryMethodPattern.Abstract.Plan;


/**
 * defend own logic
 * @by override getRate() from Plan
 */
public class InstitutionalPlan extends Plan {
    @Override
    public void getRate() {
        rate = 5.50;
    }
}
