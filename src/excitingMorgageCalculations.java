/*
REQUEST:
        double for interest rate
        int for years of payment
        int for dollars borrowed

CALCULATE:
    Monthly Payment: (I*M)/(1-(1/(1+I)^(12*Y)))

OUTPUT:
    Annual interest rate (%)
    Mortgage Amount $$
    Monthly payment ($$, 2 sig-fig)
    Total payment (SS, 2 sig-fig)
    Overpayment (Interest, $$, 2 sig-fig)
    Overpayment (Overall interest, %)
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class excitingMorgageCalculations {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();//constructing various classes
        NumberFormat dollars = NumberFormat.getCurrencyInstance();

        double interestRate;//initializing the input variables
        int yearsOfPayment;
        int dollarsBorrowed;

        double annualInterest;//initializing the variables that will be calculated.
        double annualPrincipal;
        double annualPercent;
        double monthlyPayment;
        double mortgageWithInterest;
        double overpayment;
        double overpaymentPercent;


        System.out.print("What is your mortgage amount? (Format as XXXXX, without dollar signs, spaces, or punctuation) > ");
        dollarsBorrowed = scan.nextInt();
        System.out.print("\nWhat is your interest rate? (Format as .0XXX, without the percent sign or spaces) > ");
        interestRate = scan.nextDouble();
        System.out.print("\nHow many years is your loan for? (Format as XX) > ");
        yearsOfPayment = scan.nextInt();

        annualPrincipal = dollarsBorrowed/yearsOfPayment;
        monthlyPayment = (interestRate*dollarsBorrowed)/(1-(1/(Math.pow((1+interestRate),12*yearsOfPayment))));
        annualInterest = (monthlyPayment*12)-(dollarsBorrowed/(yearsOfPayment));
        annualPercent = annualInterest/annualPrincipal;
        mortgageWithInterest = monthlyPayment*12*yearsOfPayment;
        overpayment = mortgageWithInterest-dollarsBorrowed;
        overpaymentPercent = overpayment/dollarsBorrowed;

        System.out.println("The annual interest rate is: "+percent.format(annualPercent));
        System.out.println("The Mortgage Amount is: "+dollars.format(dollarsBorrowed));
        System.out.println("Your monthly payment will be: "+dollars.format(monthlyPayment));
        System.out.println("Your total payment will be: " + dollars.format(mortgageWithInterest));
        System.out.println("Your overpayment will be: "+dollars.format(overpayment));
        System.out.println("Your overpayment percentage will be: "+ percent.format(overpaymentPercent));



    }
}
