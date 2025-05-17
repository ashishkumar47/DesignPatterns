package ObserverDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 05:49 pm
 */
public class SMSSubscriber implements Subscriber {

    private String phone;

    public SMSSubscriber(String phone) {
        this.phone = phone;
    }

    @Override
    public void notify(String message) {
        System.out.println("SMS to " + phone + ": " + message);
    }
}
