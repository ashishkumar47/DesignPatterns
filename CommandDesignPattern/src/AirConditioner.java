/**
 * @ author  ashishKumar
 * @ since 13-04-2024 07:05 pm
 */
public class AirConditioner {
    private int temperature;
    private boolean isOn;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void turnOnAc() {
        isOn = true;
    }

    public void turnOffAc() {
        isOn = false;
    }
}
