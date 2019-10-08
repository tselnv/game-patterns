package book.observer_from_wiki;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherDataManager weatherDataManager = new WeatherDataManager();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherDataManager);
        weatherDataManager.setMeasurements(new WeatherData(29f, 65f, 745, 1.6f));
        weatherDataManager.setMeasurements(new WeatherData(39f, 70f, 760, 0.4f));
        weatherDataManager.setMeasurements(new WeatherData(42f, 72f, 763, 2.21f));
    }
}
