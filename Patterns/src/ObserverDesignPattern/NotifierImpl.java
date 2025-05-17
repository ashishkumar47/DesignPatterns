package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 05:51 pm
 */
public class NotifierImpl implements Notifier{
    private List<Subscriber> subscribers = new ArrayList<>();
    @Override
    public void subscribe(Subscriber s) {
        this.subscribers.add(s);
    }

    @Override
    public void unsubscribe(Subscriber s) {
        this.subscribers.remove(s);
    }

    @Override
    public void notifySubscribers(String message) {
        for (Subscriber subscriber:subscribers){
            subscriber.notify(message);
        }
    }
}
