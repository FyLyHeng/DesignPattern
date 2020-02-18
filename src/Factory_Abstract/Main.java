package Factory_Abstract;

import Factory_Abstract.BANK.Bank;
import Factory_Abstract.LOAN.Loan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name of Bank ");
        String bankName = reader.readLine();


        System.out.println("\n");
        System.out.println("Enter type of loan e.g. home loan or business loan,... :");

        String loadName = reader.readLine();

        /**
         * create abstract obj
         * use obj to access to subClass of AbstractFactory is FactoryCreator
         * invoked method getFactory()
         * @purpose to check type Bank or Loan
         */
        AbstractFactory bankFactory ;
        bankFactory = FactoryCreator.getFactory("Bank");

        //get Bank Name BIS,ICICI,...
        Bank bank = bankFactory.getBank(bankName);


        System.out.print("\n");
        System.out.print("Enter the interest rate for " + bank.getName() + ": ");

        double rate = Double.parseDouble(reader.readLine());
        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");

        double loanAmount = Double.parseDouble(reader.readLine());
        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years = Integer.parseInt(reader.readLine());

        System.out.print("\n");
        System.out.println("you are taking the loan from " + bank.getName());


        /**
         * work to check Bank or Loan
         */
        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");


        /**
         * getLoad is return class of Loan
         * e.g. home,education,...
         */
        Loan loan = loanFactory.getLoan(loadName);
        loan.getInterestRate(rate);
        loan.calculateLoadPayment(loanAmount, years);

    }

}
