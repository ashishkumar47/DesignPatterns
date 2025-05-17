package ProxyDesignPattern;

/**
 * @ author  ashishKumar
 * @ since 10-05-2025 09:45 pm
 */
public class HouseProxy implements Door{
    private HouseDoor houseDoor;
    private String password;

    @Override
    public void open() {
        if(this.password.equals("abcdqwerty")){
            this.houseDoor.open();
        }else{
            System.out.println("Access Denied. Wrong password.");
        }
    }

    public HouseProxy(String password) {
        this.houseDoor = new HouseDoor();
        this.password = password;
    }
}
