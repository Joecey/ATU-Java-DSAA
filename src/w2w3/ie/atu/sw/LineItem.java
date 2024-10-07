package w2w3.ie.atu.sw;

// Again, interface gives us blueprints for WHAT LineItem should look like
// it DOES NOT tell us HOW to do it
public interface LineItem {
    public void setItemNumber (String number);
    public String getItemNumber ();
    public void setItemName (String name);
    public String getItemName ();
    public void setItemQuantity (int qty);
    public int getItemQuantity ();
    public void setItemPrice (float qty);
    public float getItemPrice ();
}
