package ProxyDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 11:35 pm
 */
public class AdminPanelProxy implements Panel{

    private AdminPanel adminPanel;
    private String userName;
    private String password;

    public AdminPanelProxy(String userName,String password) {
        this.adminPanel = new AdminPanel();
        this.userName=userName;
        this.password=password;
    }

    @Override
    public void display() {
        if(this.userName.equals("ashish")&&this.password.equals("qwerty")){
            this.adminPanel.display();
        }else{
            System.out.println("Access denied: Invalid credentials.");
        }
    }
}
