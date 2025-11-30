public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        this.temperature = weatherData.getTemperture();
        this.humidity = weatherData.getHumidity();
        display();
    }

    public void display() {
        System.out.println("現在の気象状況: 温度" + this.temperature + "度（華氏） 湿度" + this.humidity + "%");
    }
}