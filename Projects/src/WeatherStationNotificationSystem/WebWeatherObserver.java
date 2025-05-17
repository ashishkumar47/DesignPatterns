package WeatherStationNotificationSystem;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 06:02 pm
 */
public class WebWeatherObserver implements WeatherObserver{
    @Override
    public void update(int temperature) {
        System.out.println("Window display shows: " + temperature + "°C");
    }
}
