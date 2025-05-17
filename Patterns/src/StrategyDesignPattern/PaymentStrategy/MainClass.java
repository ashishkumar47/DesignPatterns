package StrategyDesignPattern.PaymentStrategy;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 04:16 pm
 */
public class MainClass {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(new CreditCardPayment("2434-3434-3434"));
        shoppingCart.checkOut(2030390);
        ShoppingCart shoppingCart1 = new ShoppingCart(new UPIPayment("ashish@paytm"));
        shoppingCart1.checkOut(2323);
    }
}
