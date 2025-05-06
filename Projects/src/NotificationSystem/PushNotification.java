package NotificationSystem;

/**
 * @ author  ashishKumar
 * @ since 07-05-2025 01:18 am
 */
public class PushNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("push notification is send for this message:"+message);
    }
}
