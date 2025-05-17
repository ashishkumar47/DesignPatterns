package ProxyDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 09:42 pm
 */
public class MainClass {
    public static void main(String[] args) {
//        HouseProxy houseProxy = new HouseProxy("fghjkl");
//        houseProxy.open();
//        HouseProxy houseProxy1 = new HouseProxy("abcdqwerty");
//        houseProxy1.open();
        AdminPanelProxy adminPanelProxy = new AdminPanelProxy("djfkd","ghjk");
        adminPanelProxy.display();
        AdminPanelProxy adminPanelProxy1 = new AdminPanelProxy("ashish","qwerty");
        adminPanelProxy1.display();
    }
}
