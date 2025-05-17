package StrategyDesignPattern.PaymentStrategy;

import StrategyDesignPattern.PaymentStrategy.PaymentStrategy;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 04:36 pm
 */
public class UPIPayment implements PaymentStrategy {
    private String UPIId;

    public UPIPayment(String UPIId) {
        this.UPIId = UPIId;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid using UPIId "+this.UPIId);
    }
}
