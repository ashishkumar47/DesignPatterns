package DocumentViewerSystem;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 08:45 pm
 */
public class PdfAdaptor implements Document{

    private PdfReader pdfReader;

    public PdfAdaptor(PdfReader pdfReader) {
        this.pdfReader = pdfReader;
    }

    @Override
    public String readContent() {
        return this.pdfReader.readPDF();
    }
}
