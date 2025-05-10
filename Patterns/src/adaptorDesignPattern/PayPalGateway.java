package adaptorDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 09-05-2025 04:06 pm
 */
public class PayPalGateway {
    public void makePayment(double amount,String currency){
        System.out.println("Paying " + amount + currency + " using PayPal");
    }
}
