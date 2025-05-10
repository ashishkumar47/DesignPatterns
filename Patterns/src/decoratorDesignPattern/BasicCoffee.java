package decoratorDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 05:25 pm
 */
public class BasicCoffee implements Coffee{
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String description() {
        return "Plain Coffee";
    }
}
