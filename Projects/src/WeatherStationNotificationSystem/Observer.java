package WeatherStationNotificationSystem;

/**
 * @ author  ashishKumar
 * @ since 11-05-202506:03 pm
 */
public interface Observer {
    void subscribe(WeatherObserver weatherObserver);
    void unSubscribe(WeatherObserver weatherObserver);

    void notify(int temperature);
}
