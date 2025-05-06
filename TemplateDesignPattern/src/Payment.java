/**
 * @ author  ashishKumar
 * @ since 22-04-2024 01:04 am
 */
public abstract class Payment {
    public abstract void validate();
    public abstract void debitCash();
    public abstract void CalculateFee();
    public abstract void creditMoney();

   // this is template method: which defines the order of steps to execute the task.
    public final void sendMoney(){
        validate();
        debitCash();
        CalculateFee();
        creditMoney();
    }

}
