import DriveStrategies.DriveStrategy;
import DriveStrategies.NormalDrive;

/**
 * @ author  ashishKumar
 * @ since 23-03-2024 11:43 am
 */
public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalDrive());
    }
}
