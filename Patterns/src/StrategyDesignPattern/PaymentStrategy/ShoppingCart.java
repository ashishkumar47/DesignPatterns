package StrategyDesignPattern.PaymentStrategy;

import StrategyDesignPattern.PaymentStrategy.PaymentStrategy;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 04:38 pm
 */
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void checkOut(int amount){
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method.");
        }else{
            this.paymentStrategy.pay(amount);
        }
    }
}
