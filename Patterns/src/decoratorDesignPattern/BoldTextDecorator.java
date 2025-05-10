package decoratorDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 05:53 pm
 */
public class BoldTextDecorator extends TextDecorator{
    public BoldTextDecorator(Text text) {
        super(text);
    }

    public String format() {
        return "<b>" + super.format() + "</b>";
    }

}
