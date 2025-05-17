package ObserverDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 05:42 pm
 */
public class MainClass {
    public static void main(String[] args) {
        Subscriber emailSubscriber = new EmailSubscriber("user@example.com");
        Subscriber SMSSubscriber = new SMSSubscriber("9876543210");

        Notifier notifier = new NotifierImpl();
        notifier.subscribe(emailSubscriber);
        notifier.subscribe(SMSSubscriber);
        notifier.notifySubscribers("Breaking News: Observer Pattern is awesome!");
        notifier.unsubscribe(SMSSubscriber);
        notifier.notifySubscribers("Breaking News: Observer Pattern is awesome!");

    }
}
