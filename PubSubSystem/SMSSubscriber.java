package PubSubSystem;

public class SMSSubscriber implements Subscriber{

  String subName;

  public SMSSubscriber(String subName){
    this.subName = subName;
  }
  @Override
  public void update(String message) {
    System.out.println("Hi! "+ subName +" ,you have an SMS Notification " + message);
  }
}


