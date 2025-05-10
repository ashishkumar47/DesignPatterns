package DocumentViewerSystem;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 09:05 pm
 */
public class ViewerFacade {
    public void viewPDFWithFormatting(){
        Document document = new PdfAdaptor(new PdfReader());
        document = new BoldDocumentDecorator(document);
        document = new ItalicDocumentDecorator(document);
        System.out.println("PDF content is"+document.readContent());
    }

    public void viewWordWithFormatting(){
        Document document = new WordAdaptor(new WordReader());
        document = new ItalicDocumentDecorator(document);
        document = new BoldDocumentDecorator(document);
        System.out.println("Word content is"+document.readContent());
    }
}
