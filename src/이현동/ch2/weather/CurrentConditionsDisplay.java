package main.ch2.weather;



public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temp;
    private float humidity;
    private WeatherData weatherData;


    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 상태 :온도 " + this.temp + "F, 습도 :" + this.humidity + "%");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }


}
