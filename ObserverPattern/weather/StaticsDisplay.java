public class StaticsDisplay implements Observer, DisplayElement {
    private float maxTemperature = 0.0f;
    private float minTemperature = 200;
    private float temperatureSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StaticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        float temperature = weatherData.getTemperture();
        temperatureSum += temperature;
        numReadings++;

        if (temperature > maxTemperature) {
            this.maxTemperature = temperature;
        }

        if (temperature < minTemperature) {
            this.minTemperature = temperature;
        }

        display();
    }

    public void display() {
        System.out.println("平均/最高/最低気温: " + (this.temperatureSum / this.numReadings) + "/" + this.maxTemperature + "/"
                + this.minTemperature);
    }
}