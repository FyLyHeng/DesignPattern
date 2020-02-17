package FactoryMethodPattern;

import FactoryMethodPattern.Abstract.Plan;
import FactoryMethodPattern.Generater.GetPlanFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * create obj of Generater
         */
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter name of plan for which the bill will be generated");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            String planName = reader.readLine();
            System.out.println("Enter number of units for Bill will be calculated: ");
            int units = Integer.parseInt(reader.readLine());


            Plan plan = planFactory.getPlan(planName);


            /**
             * call getRate() and caculateBill()
             */
            plan.getRate();
            plan.caculateBill(units);




    }
}
