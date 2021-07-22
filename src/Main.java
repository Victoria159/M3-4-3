public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000;
        double interestRate = 9.99;
        int loanTerm;
        int annuityPayment1 = service.calculate(loanAmount, interestRate, 12);
        System.out.println(annuityPayment1);

        int annuityPayment2 = service.calculate(loanAmount, interestRate, 24);
        System.out.println(annuityPayment2);

        int annuityPayment3 = service.calculate(loanAmount, interestRate, 36);
        System.out.println(annuityPayment3);
    }
}
