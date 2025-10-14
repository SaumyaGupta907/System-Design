package ObserverAmazonStock;

public class messagesub implements sub {
    String username;
    messagesub(String username){
        this.username=username;
    }

    @Override
    public void update(String product) {
        System.out.println(" Message Notification to "+ this.username +" : "+product + " is now available");
    }
}

