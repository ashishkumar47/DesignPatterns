package DocumentViewerSystem;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 08:49 pm
 */
public class MainClass {

    public static void main(String[] args) {
        ViewerFacade viewerFacade = new ViewerFacade();
        viewerFacade.viewPDFWithFormatting();
        viewerFacade.viewWordWithFormatting();
    }

}
