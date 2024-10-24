package w4.ie.atu.sw;

public interface LineItem extends Comparable<LineItem> {

    public void setItemNumber(String number);

    public String getItemNumber();

    public void setItemName(String name);

    public String getItemName();

    public void setItemQuantity(int qty);

    public int getItemQuantity();

    public void setItemPrice(float price);

    public float getItemPrice();


}
