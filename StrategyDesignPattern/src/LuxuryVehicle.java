import DriveStrategies.DriveStrategy;
import DriveStrategies.LuxuryDrive;

/**
 * @ author  ashishKumar
 * @ since 23-03-2024 11:44 am
 */
public class LuxuryVehicle extends Vehicle{
    public LuxuryVehicle() {
        super(new LuxuryDrive());
    }
}
