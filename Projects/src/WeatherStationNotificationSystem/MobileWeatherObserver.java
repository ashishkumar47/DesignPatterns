package WeatherStationNotificationSystem;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 06:01 pm
 */
public class MobileWeatherObserver implements WeatherObserver{

    private String name;

    public MobileWeatherObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(name + " received temperature update: " + temperature + "°C");
    }
}
