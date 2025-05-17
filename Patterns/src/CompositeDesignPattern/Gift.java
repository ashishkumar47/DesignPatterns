package CompositeDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 12:02 am
 */
public class Gift implements GiftItem{
    private String name;

    public Gift(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Opening gift: " + name);
    }
}
