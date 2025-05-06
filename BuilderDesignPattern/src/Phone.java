/**
 * @ author  ashishKumar
 * @ since 16-03-2024 07:00 pm
 */
public class Phone {
    private String os;
    private String name;
    private String modelNumber;
    private String screenSize;
    private String ram;

    public Phone(PhoneBuilder phoneBuilder) {
        this.os = phoneBuilder.getOs();
        this.name = phoneBuilder.getName();
        this.modelNumber = phoneBuilder.getModelNumber();
        this.screenSize = phoneBuilder.getScreenSize();
        this.ram = phoneBuilder.getRam();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
