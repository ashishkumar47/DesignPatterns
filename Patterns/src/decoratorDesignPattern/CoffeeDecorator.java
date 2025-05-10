package decoratorDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 05:26 pm
 */
public class CoffeeDecorator implements Coffee{

    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return this.coffee.cost();
    }

    @Override
    public String description() {
        return this.coffee.description();
    }
}
