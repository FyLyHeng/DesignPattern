package Factory_Abstract;

import Factory_Abstract.BANK.Bank;
import Factory_Abstract.LOAN.Loan;


/**
 * AbstractFactory class to generate the object of concrete class based on given information.
 * define busies logic
 */

abstract class AbstractFactory {

    /**
     * create two local method for subClass
     * subclass must be override
     * @returnType is Class e.g. Bank or Loan
     */

    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
