package DocumentViewerSystem;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 09:00 pm
 */
public class BoldDocumentDecorator extends DocumentDecorator{
    public BoldDocumentDecorator(Document document) {
        super(document);
    }

    public String readContent() {
        return "<b>" + super.readContent() + "</b>";
    }

}
