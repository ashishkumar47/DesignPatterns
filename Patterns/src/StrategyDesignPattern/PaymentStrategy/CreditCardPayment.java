package StrategyDesignPattern.PaymentStrategy;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 04:33 pm
 */
public class CreditCardPayment implements PaymentStrategy{
    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid using credit card number "+this.creditCardNumber);
    }
}
