package w2w3.ie.atu.sw;

import java.util.Date;

// Again, interface gives us blueprints for WHAT Order should look like
// it DOES NOT tell us HOW to do it
public interface Order {
    public String getOrderNumber();
    public Date getOrderDate();
    public boolean addItem(LineItem item);  // a class that implements LineItem is needed!
    public boolean removeItem (LineItem item); // a class that implements LineItem is needed!
    public LineItem[] items();
    public float getTotal();
}
