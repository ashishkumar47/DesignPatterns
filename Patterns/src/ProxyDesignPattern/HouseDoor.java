package ProxyDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 09:45 pm
 */
public class HouseDoor implements  Door{
    @Override
    public void open() {
        System.out.println("Door is opened");
    }
}
