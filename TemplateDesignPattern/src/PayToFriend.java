/**
 * @ author  ashishKumar
 * @ since 22-04-2024 01:06 am
 */
public class PayToFriend extends Payment{
    @Override
    public void validate() {
        System.out.println("amount validated when paying to friend");
    }

    @Override
    public void debitCash() {
        System.out.println("cash debited from the amount when paying to friend");
    }

    @Override
    public void CalculateFee() {
        System.out.println("1% platform fee is charged when paying to friend");
    }

    @Override
    public void creditMoney() {
        System.out.println("cash credited from the amount when paying to friend");
    }
}
