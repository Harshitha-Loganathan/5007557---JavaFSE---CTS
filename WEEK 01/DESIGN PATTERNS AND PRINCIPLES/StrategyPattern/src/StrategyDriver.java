public class StrategyDriver {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/23");
        context.setPaymentStrategy(creditCardPayment);
        context.pay(100.0);

        // Pay using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com", "password");
        context.setPaymentStrategy(payPalPayment);
        context.pay(200.0);
    }
}
