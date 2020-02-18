package Factory_Abstract;

import Factory_Abstract.BANK.Bank;
import Factory_Abstract.LOAN.BussinessLoan;
import Factory_Abstract.LOAN.EducationLoan;
import Factory_Abstract.LOAN.HomeLoan;
import Factory_Abstract.LOAN.Loan;

public class LoanFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bank){
        return null;
    }


    /**
     *
     * @return
     */
    @Override
    public Loan getLoan(String loan){
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Business")){
            return new BussinessLoan();
        } else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }
}
