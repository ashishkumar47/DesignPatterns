package CompositeDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 11:59 pm
 */
public class MainClass {
    public static void main(String[] args) {
        Gift toy = new Gift("toy");
        Gift bear = new Gift("bear");

        GiftBox smallBox = new GiftBox();
        smallBox.addItem(toy);
        smallBox.addItem(bear);

        GiftBox bigBox = new GiftBox();
        bigBox.addItem(smallBox);
        bigBox.open();

    }

}
