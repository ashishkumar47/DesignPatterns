package FacadeDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 06:24 pm
 */
public class Memory {
    public void load(long position, String data) {
        System.out.println("Loading data to memory at " + position + ": " + data);
    }
}
