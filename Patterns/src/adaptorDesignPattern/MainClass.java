package adaptorDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 08-05-2025 12:41 am
 */
public class MainClass {
    public static void main(String[] args) {
//        TextPrinter textPrinter= new FancyPrinterAdaptor();
//        textPrinter.printText("hello there!");

        PaymentProcessor paymentProcessor = new PayPalAdaptor(new PayPalGateway());
        paymentProcessor.pay(200);
    }
}
