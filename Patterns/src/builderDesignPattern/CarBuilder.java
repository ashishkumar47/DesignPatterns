package builderDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 07-05-2025 12:36 am
 */
public class CarBuilder {
    private Car car;
    public CarBuilder(){
        this.car=new Car();
    }
    public CarBuilder addEngine(String engine){
        car.setEngine(engine);
        return this;
    }
    public CarBuilder addWheels(int wheels){
        car.setWheels(wheels);
        return this;
    }
    public Car build(){
        return car;
    }
    public static CarBuilder getBuilder(){
        return new CarBuilder();
    }
}
