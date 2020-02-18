package Factory_Abstract.LOAN;

public class EducationLoan extends Loan {
    @Override
    public void getInterestRate(double rate) {
        this.rate=rate;
    }
}
