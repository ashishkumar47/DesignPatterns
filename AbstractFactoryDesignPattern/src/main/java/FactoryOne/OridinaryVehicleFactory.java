package FactoryOne;

/**
 * @ author  ashishKumar
 * @ since 25-02-2024 12:20 am
 */
public class OridinaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicleName) {
        switch (vehicleName){
            case "ALTO":
                return new Alto();
            default:
                return new Maruti();
        }
    }
}
