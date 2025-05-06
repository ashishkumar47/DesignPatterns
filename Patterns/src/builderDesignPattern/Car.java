package builderDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 07-05-2025 12:35 am
 */
public class Car {
    private String engine;
    private int wheels;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
