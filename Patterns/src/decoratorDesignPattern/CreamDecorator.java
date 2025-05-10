package decoratorDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 05:32 pm
 */
public class CreamDecorator extends CoffeeDecorator{
    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost()+3.0;
    }

    @Override
    public String description() {
        return super.description()+",Cream";
    }
}
