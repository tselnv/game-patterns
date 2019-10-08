package book.observer_from_wiki;

public class CurrentConditionsDisplay implements Observer {

    private WeatherData weatherData;
    private WeatherDataManager weatherDataManager;


    public CurrentConditionsDisplay(WeatherDataManager weatherDataManager) {
        this.weatherDataManager = weatherDataManager;
        this.weatherDataManager.addObserver(this);
    }

    @Override
    public void onNotify(WeatherData data) {
        this.weatherData = data;
        displayWeather();
    }

    public void displayWeather(){
        System.out.printf("Сейчас значения:%.1f градусов цельсия и %.1f %% влажности. Давление %d мм рт. ст. Скорость ветра %.1f м/с \n", weatherData.temperature, weatherData.humidity, weatherData.pressure, weatherData.windSpeed);
    }
}
