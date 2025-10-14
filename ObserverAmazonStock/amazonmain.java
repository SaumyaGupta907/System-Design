package ObserverAmazonStock;

public class amazonmain {
    public static void main(String[] args) {
        stock s = new samsung("Galaxy s25 Ultra", 0);
        stock a = new apple("Iphone 18 pro max", 0);
        sub s1 = new emailsub("EmailSub1");
        sub s2 = new emailsub("EmailSub2");
        sub s3 = new emailsub("EmailSub3");

        sub m1 = new messagesub("MsgSub1");
        sub m2 = new messagesub("MsgSub2");
        sub m3 = new messagesub("MsgSub3");
        s.addsub(s1);
        s.addsub(s2);
        s.addsub(m1);

        a.addsub(s1);
        a.addsub(s3);
        a.addsub(m2);
        a.addsub(m3);

        s.setstock(10);
        a.setstock(20);
    }
}
