package ObserverDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 05:46 pm
 */
public class EmailSubscriber implements Subscriber {

    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void notify(String message) {
        System.out.println("Email to " + email + ": " + message);
    }
}
