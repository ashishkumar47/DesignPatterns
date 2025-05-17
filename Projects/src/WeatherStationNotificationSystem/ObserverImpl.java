package WeatherStationNotificationSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * @ author  ashishKumar
 * @ since 11-05-2025 06:04 pm
 */
public class ObserverImpl implements Observer{

    private List<WeatherObserver> weatherObserverList = new ArrayList<>();
    @Override
    public void subscribe(WeatherObserver weatherObserver) {
        this.weatherObserverList.add(weatherObserver);
    }

    @Override
    public void unSubscribe(WeatherObserver weatherObserver) {
        this.weatherObserverList.remove(weatherObserver);
    }

    @Override
    public void notify(int temperature) {
        for (WeatherObserver weatherObserver:this.weatherObserverList){
            weatherObserver.update(temperature);
        }
    }
}
