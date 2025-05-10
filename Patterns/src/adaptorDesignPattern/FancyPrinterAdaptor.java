package adaptorDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 08-05-2025 01:48 am
 */
public class FancyPrinterAdaptor implements TextPrinter{
    private FancyPrinter fancyPrinter;

    public FancyPrinterAdaptor() {
        this.fancyPrinter = new FancyPrinter();
    }

    @Override
    public void printText(String text) {
        fancyPrinter.printFancy(text);
    }
}
