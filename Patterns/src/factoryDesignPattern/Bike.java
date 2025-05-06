package factoryDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 07-05-2025 12:00 am
 */
public class Bike implements Vehicle{
    @Override
    public void noOfWheels() {
        System.out.println("Bike has 2 wheels");
    }
}
