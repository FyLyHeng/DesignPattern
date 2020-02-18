package Factory_Abstract;

import Factory_Abstract.BANK.Bank;
import Factory_Abstract.BANK.HDFC;
import Factory_Abstract.BANK.ICICI;
import Factory_Abstract.BANK.SBI;
import Factory_Abstract.LOAN.Loan;

public class BankFactory extends AbstractFactory{

    /**
     *
     * override getBank() gived by AbstractFactory
     * @returnType class
     */

    @Override
    public Bank getBank(String bank) {
        if (bank == null){
            return null;
        }

        if (bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        }
        else if (bank.equalsIgnoreCase("ICICI")){
            return new ICICI();
        }
        else if (bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }

        return null;
    }


    @Override
    public Loan getLoan(String loan) {

        return null;
    }
}
