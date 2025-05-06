/**
 * @ author  ashishKumar
 * @ since 16-03-2024 11:41 am
 */
public class MainClass {
    public static void main(String[] args) {
        Phone phone= new PhoneBuilder().setModelNumber("djhfjd").setName("Pixel").setOs("andriod").setRam("8GB").setScreenSize("6.6'").build();
        System.out.println(phone);
    }
}
