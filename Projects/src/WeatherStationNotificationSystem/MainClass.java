package WeatherStationNotificationSystem;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 05:59 pm
 */
public class MainClass {
    public static void main(String[] args) {
        MobileWeatherObserver weatherObserver = new MobileWeatherObserver("23243232");
        WebWeatherObserver webWeatherObserver = new WebWeatherObserver();

        Observer observer = new ObserverImpl();
        observer.subscribe(weatherObserver);
        observer.subscribe(webWeatherObserver);
        observer.notify(34);

    }
}
