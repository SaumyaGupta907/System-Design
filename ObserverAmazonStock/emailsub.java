package ObserverAmazonStock;

public class emailsub implements sub {
    String email;
     emailsub(String email){
        this.email=email;
    }

    @Override
    public void update(String product) {
        System.out.println(" Email Notification "+ this.email+" : " +product + " is now available");
    }
}
