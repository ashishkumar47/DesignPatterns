package DocumentViewerSystem;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 08:47 pm
 */
public class WordAdaptor implements Document{

    private WordReader wordReader;

    public WordAdaptor(WordReader wordReader) {
        this.wordReader = wordReader;
    }

    @Override
    public String readContent() {
        return this.wordReader.readWord();
    }
}
