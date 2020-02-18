package Factory_Abstract;

public class FactoryCreator {


    /**
     * define static method name (getFactory)
     * @returnType is abstract class (AbstractFactory)
     *
     * @return class
     */
    public static  AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("Bank")){
            return new  BankFactory();
        }
        else if (choice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }

        return null;
    }
}
