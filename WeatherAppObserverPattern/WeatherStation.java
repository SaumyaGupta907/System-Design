package WeatherAppObserverPattern;

import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
class WeatherStation {
  private List<Observer> observers = new ArrayList<>();
  private String weather;

  // Attach observer
  public void addObserver(Observer o) {
    observers.add(o);
  }

  // Detach observer
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  // Set state + notify
  public void setWeather(String weather) {
    this.weather = weather;
    notifyObservers();
  }

  // Notify all observers
  private void notifyObservers() {
    for (Observer o : observers) {
      o.update(weather);
    }
  }
}
