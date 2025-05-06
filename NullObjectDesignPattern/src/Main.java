/**
 * @ author  ashishKumar
 * @ since 23-03-2024 07:14 pm
 */
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle= VehicleFactory.getVehicle("car");
        System.out.println("vehicle seating capacity:"+vehicle.getSeatCapacity());
        System.out.println("vehicle tank capacity:"+vehicle.getTankCapacity());
    }
}
