package NotificationSystem;

/**
 * @ author  ashishKumar
 * @ since 07-05-2025 01:28 am
 */
public class Message {
    private String tile;
    private String body;
    private int priority;

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Message{" +
                "tile='" + tile + '\'' +
                ", body='" + body + '\'' +
                ", priority=" + priority +
                '}';
    }
}
