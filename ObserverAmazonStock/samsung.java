package ObserverAmazonStock;

import java.util.ArrayList;
import java.util.List;

public class samsung implements stock {
    String productname;
    int stock;
    public List<sub> s= new ArrayList<>();
    samsung(String pname,int stock){
        this.productname=pname;
        this.stock=stock;
    }
    public void addsub(sub s){
        this.s.add(s);
    }
    public void removesub(sub s){
        this.s.remove(s);
    }
    public void notifysub() {
        for (sub o: this.s) {
            o.update(this.productname);
        }
    }
    public void setstock(int amt){
        if (this.stock==0){
            this.stock+=amt;
            notifysub();
        }
    }
}
