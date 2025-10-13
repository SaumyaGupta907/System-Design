package PubSubSystem;

import java.util.ArrayList;
import java.util.List;

public class Topic implements IPublisher {

  List<Subscriber> subscriberList = new ArrayList<>();
  String topicName;
  String msg;

  public Topic(String name){
    this.topicName = name;
  }
  @Override
  public void addSubscriber(Subscriber subscriber) {
    this.subscriberList.add(subscriber);
  }

  @Override
  public void removeSubscriber(Subscriber subscriber) {
    subscriber.update("Your subscription from " + this.topicName + " has been canceled");
    this.subscriberList.remove(subscriber);
  }

  @Override
  public void notifySubscriber() {
    for(Subscriber sub: subscriberList){
      sub.update(this.msg);
    }
  }

  @Override
  public void updateTopic(String message) {
    this.msg = this.topicName + " " + "has been updated to:" + " " + message;
    notifySubscriber();
  }
}
