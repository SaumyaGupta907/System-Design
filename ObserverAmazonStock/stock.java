package ObserverAmazonStock;

public interface stock {
    void addsub(sub s);
    void removesub(sub s);
    void notifysub();
    void setstock(int amt);

}
