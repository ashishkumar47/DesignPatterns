package decoratorDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 05:56 pm
 */
public class UnderLineTextDecorator extends TextDecorator{
    public UnderLineTextDecorator(Text text) {
        super(text);
    }

    public String format(){
        return "<u>" + super.format() + "</u>";
    }
}
