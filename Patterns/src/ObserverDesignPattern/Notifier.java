package ObserverDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 11-05-202505:50 pm
 */
public interface Notifier {
    void subscribe(Subscriber s);
    void unsubscribe(Subscriber s);
    void notifySubscribers(String news);
}
