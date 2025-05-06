/**
 * @ author  ashishKumar
 * @ since 22-04-2024 01:09 am
 */
public class PayToMerchant extends Payment{
    @Override
    public void validate() {
        System.out.println("amount validated when paying to merchant");
    }

    @Override
    public void debitCash() {
        System.out.println("cash debited from the amount when paying to merchant");
    }

    @Override
    public void CalculateFee() {
        System.out.println("2% platform fee is charged when paying to merchant");
    }

    @Override
    public void creditMoney() {
        System.out.println("cash credited from the amount when paying to merchant");
    }
}
