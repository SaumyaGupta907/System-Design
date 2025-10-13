package PubSubSystem;

public interface IPublisher {

  public void addSubscriber(Subscriber subscriber);
  public void removeSubscriber(Subscriber subscriber);
  public void notifySubscriber();
  public void updateTopic(String message);
}
