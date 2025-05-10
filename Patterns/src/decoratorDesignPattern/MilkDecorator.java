package decoratorDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 05:28 pm
 */
public class MilkDecorator extends CoffeeDecorator{


    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost()+2.0;
    }

    @Override
    public String description() {
        return super.description()+",Milk";
    }
}
