package ObserverPattern;

// Concrete Observer 2
class TVDisplay implements Observer {
  public void update(String weather) {
    System.out.println("TV Display: Weather updated → " + weather);
  }
}
