package factoryDesignPattern;

import java.awt.*;

/**
 * @ author  ashishKumar
 * @ since 06-05-2025 11:58 pm
 */
public class Cycle implements Vehicle {
    @Override
    public void noOfWheels() {
        System.out.println("cycle has 2 wheels");
    }
}
