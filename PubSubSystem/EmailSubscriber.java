package PubSubSystem;

public class EmailSubscriber implements Subscriber{
  String subName;

  public EmailSubscriber(String subName){
    // subName should be an email, for ease we have passed a name
    this.subName = subName;
  }
  @Override
  public void update(String message) {
    System.out.println("Hi! "+ subName +" ,you have an Email Notification " + message);
  }
}
