/**
 * @ author  ashishKumar
 * @ since 23-03-2024 07:12 pm
 */
public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType){
        if("car".equals(vehicleType)){
            return new Car();
        }
        return new NullVehicle();
    }
}
