public class AdapterPatternDriver{
    public static void main(String[] args) {

        PayPal payPal = new PayPal();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        payPalAdapter.processPayment(100.0);

        Stripe stripe = new Stripe();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.processPayment(200.0);
    }
}
