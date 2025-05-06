import DriveStrategies.DriveStrategy;
import DriveStrategies.SpecialDrive;

/**
 * @ author  ashishKumar
 * @ since 23-03-2024 11:51 am
 */
public class SpecialVehicle extends Vehicle{
    public SpecialVehicle() {
        super(new SpecialDrive());
    }
}
