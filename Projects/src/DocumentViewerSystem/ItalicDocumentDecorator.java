package DocumentViewerSystem;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 09:01 pm
 */
public class ItalicDocumentDecorator extends DocumentDecorator{
    public ItalicDocumentDecorator(Document document) {
        super(document);
    }

    public String readContent() {
        return "<I>" + super.readContent() + "</I>";
    }
}
