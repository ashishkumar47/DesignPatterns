package NotificationSystem;

/**
 * @ author  ashishKumar
 * @ since 07-05-2025 01:30 am
 */
public class MessageBuilder {
    private Message message;

    MessageBuilder(){
        message = new Message();
    }
    public MessageBuilder setTitle(String title){
        message.setTile(title);
        return this;
    }
    public MessageBuilder setBody(String body){
        message.setBody(body);
        return this;
    }
    public MessageBuilder setPriority(int priority){
        message.setPriority(priority);
        return this;
    }
    public String build(){
        return message.toString();
    }
    public static MessageBuilder getBuilder(){
        return new MessageBuilder();
    }
}
