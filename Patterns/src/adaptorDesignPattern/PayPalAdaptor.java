package adaptorDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 09-05-2025 04:14 pm
 */
public class PayPalAdaptor implements PaymentProcessor{
    private PayPalGateway payPalGateway;

    public PayPalAdaptor(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void pay(double amount) {
        this.payPalGateway.makePayment(amount,"$");
    }
}
