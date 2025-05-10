package decoratorDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 05:55 pm
 */
public class ItalicTextDecorator extends TextDecorator{
    public ItalicTextDecorator(Text text) {
        super(text);
    }

    public String format(){
        return "<i>" + super.format() + "</i>";
    }
}
