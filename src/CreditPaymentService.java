public class CreditPaymentService {
    public double calculate(int creditAmount , int creditTerm, double interestRate) {
        double interestRateMonth = interestRate / 100 / 12;
        double pow = Math.pow((1 + interestRateMonth), creditTerm);
        double monthlyPayment = creditAmount * interestRateMonth * pow / (pow - 1);
        return monthlyPayment;
    }
}
