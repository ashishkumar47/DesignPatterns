package NotificationSystem;

/**
 * @ author  ashishKumar
 * @ since 07-05-2025 01:12 am
 */
public class NotificationConfig {
    private static NotificationConfig config;
    private NotificationConfig(){

    }
    public static NotificationConfig getInstance(){
        if(config==null){
            synchronized (NotificationConfig.class){
                if (config==null){
                    config = new NotificationConfig();
                }
            }
        }
        return config;
    }
}
