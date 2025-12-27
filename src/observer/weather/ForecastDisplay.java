public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update() {
		this.lastPressure = this.currentPressure;
		this.currentPressure = weatherData.getPressure();

		display();
	}

	public void display() {
		System.out.print("予報: ");
		if (this.currentPressure > this.lastPressure) {
			System.out.println("天候は良くなります！");
		} else if (this.currentPressure == this.lastPressure) {
			System.out.println("ほとんど同じです");
		} else if (this.currentPressure < this.lastPressure) {
			System.out.println("寒い雨模様の天候に注意してください");
		}
	}
}