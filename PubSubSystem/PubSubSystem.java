package PubSubSystem;

import java.util.concurrent.Flow;

public class PubSubSystem {

  public static void main(String[] args) {

    IPublisher topic1 = new Topic("Topic1");
    IPublisher topic2 = new Topic("Topic2");
    IPublisher topic3 = new Topic("Topic3");

    Subscriber smsSub1 = new SMSSubscriber("Sub1");
    Subscriber smsSub2 = new SMSSubscriber("Sub2");
    Subscriber emailSub1 = new EmailSubscriber("Sub3");
    Subscriber emailSub2 = new EmailSubscriber("Sub4");

    topic1.addSubscriber(smsSub1);
    topic1.addSubscriber(emailSub1);
    topic2.addSubscriber(smsSub2);
    topic3.addSubscriber(emailSub2);

    topic1.updateTopic("Iphone 99 released");
    topic2.updateTopic("New emerging technologies");
    topic3.updateTopic("AGI is next!");

    topic1.removeSubscriber(emailSub1);
    topic1.updateTopic("Iphone 100 released");

  }

}
