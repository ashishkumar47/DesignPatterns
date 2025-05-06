import FactoryOne.Vehicle;
import FactoryOne.VehicleFactory;
import FactoryTwo.VehicleTypeFactory;

/**
 * @ author  ashishKumar
 * @ since 25-02-2024 12:11 am
 */
public class MainClass {
    public static void main(String[] args) {
        VehicleTypeFactory vehicleTypeFactory= new VehicleTypeFactory();
        VehicleFactory vehicleFactory=vehicleTypeFactory.getVehicleFactoryType("LUXUARY");
        Vehicle vehicle=vehicleFactory.getVehicle("");
        System.out.println(vehicle.average());
    }
}
