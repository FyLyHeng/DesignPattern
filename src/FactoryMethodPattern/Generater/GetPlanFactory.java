package FactoryMethodPattern.Generater;

import FactoryMethodPattern.Abstract.Plan;
import FactoryMethodPattern.Concrete.CommercialPlan;
import FactoryMethodPattern.Concrete.DomesticPlan;
import FactoryMethodPattern.Concrete.InstitutionalPlan;

public class GetPlanFactory {


    /**
     * create local Method getPlan
     *
     * @param planType
     * @returnType is Plan(class)
     * @porpus use getPlan method to get obj of type Plan
     */
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }

        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }

        return null;
    }
}
