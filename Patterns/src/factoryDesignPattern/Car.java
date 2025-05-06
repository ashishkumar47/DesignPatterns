package factoryDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 06-05-2025 11:59 pm
 */
public class Car implements Vehicle{
    @Override
    public void noOfWheels() {
        System.out.println("car has 4 wheels");
    }
}
