import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CreditPaymentService {
    public int calculate(int loanAmount, double interestRate, int loanTerm) {
        double monthlyInterestRate = interestRate / 100 / 12;
        double denominator = Math.pow(1 + monthlyInterestRate, loanTerm) - 1;
        double fraction = monthlyInterestRate / denominator;
        double amount = monthlyInterestRate + fraction;
        double result = loanAmount * amount;
        int annuityPayment = (int) result;

        return annuityPayment;
    }
}