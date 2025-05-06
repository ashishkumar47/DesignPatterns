package NotificationSystem;

/**
 * @ author  ashishKumar
 * @ since 07-05-2025 01:17 am
 */
public class SMSNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("SMS notification is send for this message:"+message);
    }
}
