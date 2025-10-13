package WeatherAppObserverPattern;

// Concrete Observer 1
class PhoneDisplay implements Observer {
  public void update(String weather) {
    System.out.println("Phone Display: Weather updated → " + weather);
  }
}