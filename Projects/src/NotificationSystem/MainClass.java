package NotificationSystem;

/**
 * @ author  ashishKumar
 * @ since 07-05-2025 01:05 am
 */
public class MainClass {
    public static void main(String[] args) {
        NotificationConfig config = NotificationConfig.getInstance();
        Notification notification = NotificationFactory.getNotification("sms");
        String message = MessageBuilder.getBuilder().setBody("hello world").setTitle("new message").setPriority(1).build();
        notification.send(message);
    }
}
