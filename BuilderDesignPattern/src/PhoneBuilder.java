/**
 * @ author  ashishKumar
 * @ since 16-03-2024 06:57 pm
 */
public class PhoneBuilder {
    private String os;
    private String name;
    private String modelNumber;
    private String screenSize;
    private String ram;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
        return this;
    }

    public PhoneBuilder setScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public String getOs() {
        return os;
    }

    public String getName() {
        return name;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getRam() {
        return ram;
    }

    public Phone build(){
        return new Phone(this);
    }
}
