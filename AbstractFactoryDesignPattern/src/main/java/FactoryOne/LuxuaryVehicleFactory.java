package FactoryOne;

/**
 * @ author  ashishKumar
 * @ since 25-02-2024 12:17 am
 */
public class LuxuaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicleName) {
        switch (vehicleName){
            case "BMW":
                return new Bmw();
            default:
                return new Audi();
        }
    }
}
