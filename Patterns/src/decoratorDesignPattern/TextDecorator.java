package decoratorDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 05:51 pm
 */
public class TextDecorator implements Text{
    private Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String format() {
        return this.text.format();
    }
}
