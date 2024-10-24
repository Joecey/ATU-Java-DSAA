    package w4.ie.atu.sw;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Trolley Implementation using composition");
        System.out.println("Note: See the naming conventions we use ");

        Order o = new OrderImpl("QB-69420");
        LineItem item1 = new LineItemImpl("AA3", "Hatsune Miku figure", 4, 899.86f);
        LineItem item2 = new LineItemImpl("AA1", "Plushie", 19, 20.99f);
        LineItem item3 = new LineItemImpl("AA2", "Can of Heinz Beans", 100, 3.00f);

        o.addItem(item1);
        o.addItem(item2);
        o.addItem(item3);

        LineItem[] items = o.items();
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + ": " + items[i].getItemName());
        }

        System.out.println("Total: " + o.getTotal());

        System.out.println("Tree Implementation");

        // this causes a problem becomes it will only remove the first instance of the item
        // so - we had to create a hashcode to allow for better comparison (generate hashCode)
        LineItem itemX = new LineItemImpl("AA2", "Can of Heinz Beans", 100, 3.00f);
        o.removeItem(itemX);
        System.out.println("Count: " + o.items().length);

    }
}
