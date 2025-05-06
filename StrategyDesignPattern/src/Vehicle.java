import DriveStrategies.DriveStrategy;

/**
 * @ author  ashishKumar
 * @ since 23-03-2024 11:39 am
 */
public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        this.driveStrategy.drive();
    }
}
