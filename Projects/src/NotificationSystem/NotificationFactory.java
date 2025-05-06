package NotificationSystem;

/**
 * @ author  ashishKumar
 * @ since 07-05-2025 01:20 am
 */
public class NotificationFactory {

    public static Notification getNotification(String name){
        switch(name){
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            default:
                return new PushNotification();
        }
    }
}
