package decoratorDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 05:50 pm
 */
public class PlainText implements Text{

    private String content;

    public PlainText(String content) {
        this.content = content;
    }

    @Override
    public String format() {
        return content;
    }
}
