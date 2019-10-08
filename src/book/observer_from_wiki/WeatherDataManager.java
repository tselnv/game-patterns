package book.observer_from_wiki;

public class WeatherDataManager extends AbstractSubject  {
    private WeatherData weatherData;

    @Override
    public void notifyObserver() {
        for (Observer obs: observerSet){
            obs.onNotify(weatherData);
        }
    }

    public void setMeasurements(WeatherData weatherData) {
        this.weatherData = weatherData;
        notifyObserver();
    }
}
