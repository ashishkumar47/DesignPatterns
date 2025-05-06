package builderDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 07-05-2025 12:28 am
 */
public class MainClass {
    public static void main(String[] args) {
        Car car = CarBuilder.getBuilder().addEngine("2 cylinder").addWheels(3).build();
        System.out.println(car);
    }
}
