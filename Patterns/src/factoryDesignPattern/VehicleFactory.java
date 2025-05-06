package factoryDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 07-05-2025 12:00 am
 */
public class VehicleFactory {
    public Vehicle getVehicle(String name){
        return switch (name) {
            case "bike" -> new Bike();
            case "cycle" -> new Cycle();
            case "car" -> new Car();
            default -> new Truck();
        };
    }
}
