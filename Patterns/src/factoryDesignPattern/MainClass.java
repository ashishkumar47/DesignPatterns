package factoryDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 06-05-2025 11:56 pm
 */
public class MainClass {
    public static void main(String[] args) {
        Vehicle vehicle = new VehicleFactory().getVehicle("");
        vehicle.noOfWheels();
    }
}
