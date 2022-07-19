public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount = 1000000;
        int creditTerm = 12;
        double interestRate = 9.99;
        double monthlyPayment = service.calculate(creditAmount, creditTerm, interestRate);
        System.out.println((int) monthlyPayment);

        creditTerm = 24;
        monthlyPayment = service.calculate(creditAmount, creditTerm, interestRate);
        System.out.println((int) monthlyPayment);

        creditTerm = 36;
        monthlyPayment = service.calculate(creditAmount, creditTerm, interestRate);
        System.out.println((int) monthlyPayment);
    }
}
