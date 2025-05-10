package DocumentViewerSystem;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 08:55 pm
 */
public class DocumentDecorator implements Document{

    private Document document;

    public DocumentDecorator(Document document) {
        this.document = document;
    }

    @Override
    public String readContent() {
        return this.document.readContent();
    }
}
