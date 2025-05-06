package factoryDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 07-05-2025 12:06 am
 */
public class Truck implements Vehicle{
    @Override
    public void noOfWheels() {
        System.out.println("Truck has 8 wheels");
    }
}
