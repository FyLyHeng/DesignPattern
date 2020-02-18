package Factory_Abstract.LOAN;


/**
 * override exits business logic
 */
public class BussinessLoan extends Loan {
    @Override
    public void getInterestRate(double rate) {
        this.rate = rate;
    }
}
