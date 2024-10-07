package w2w3.ie.atu.sw;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World - Welcome To DSAA Week 2");
        System.out.println("Today, we will be creating abstractions from a Shopping Trolley and a Tree");

        // when creating an interface, don't forget to explicitly set it when creating a new Class
        // When creating the Interfaces, we can't create a new class
        // instead, a new class needs to IMPLEMENT the interface

        // ! This gives an error! as LineItem is abstracted
        // LineItem attempt = new LineItem();

        // This works as a null value is legal for this interface
        Order o = null;
        LineItem li = null;
        TreeNode<Integer> node = null;
    }


}
