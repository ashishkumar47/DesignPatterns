package decoratorDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 01:26 am
 */
public class MainClass {
    public static void main(String[] args) {
//        Coffee coffee = new BasicCoffee();
//        MilkDecorator milkDecorator = new MilkDecorator(coffee);
//        CreamDecorator creamDecorator = new CreamDecorator(milkDecorator);
//        System.out.println(creamDecorator.cost());
//        System.out.println(creamDecorator.description());
        Text text = new PlainText("hello world");
        text = new BoldTextDecorator(text);
        text = new UnderLineTextDecorator(text);
        text = new ItalicTextDecorator(text);
        System.out.println(text.format());

    }
}
