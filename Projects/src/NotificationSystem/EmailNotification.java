package NotificationSystem;

/**
 * @ author  ashishKumar
 * @ since 07-05-2025 01:17 am
 */
public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Email notification is send for message:"+message);
    }
}
