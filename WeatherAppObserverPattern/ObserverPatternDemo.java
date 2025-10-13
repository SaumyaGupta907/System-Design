package WeatherAppObserverPattern;

// Main class
public class ObserverPatternDemo {
  public static void main(String[] args) {
    WeatherStation station = new WeatherStation();

    Observer phone = new PhoneDisplay();
    Observer tv = new TVDisplay();

    // Subscribe observers
    station.addObserver(phone);
    station.addObserver(tv);

    // State change
    station.setWeather("Sunny");
    station.setWeather("Rainy");
  }
}

