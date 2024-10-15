package w3.ie.atu.sw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListRunner {
    public static void main(String[] args) {

        // Examples of different Lists being created
        ArrayList<String> list1 = new ArrayList<String>(); // list to store Strings
        LinkedList<String> list2 = new LinkedList<String>(); // what even is a LinkedList smile
        List<String> list3 = new ArrayList<String>();

        // here we can swap the abstraction
        list3 = new LinkedList<String>();
        list3 = new Vector<String>();   // don't use this!

        List list4 = new ArrayList();   // this is fine but it's weakly typed (what is this, python?)

        List<Integer> list5 = new ArrayList<>();    // Any object type can be used in a Collection
        List<List<Integer>> list7 = new ArrayList<List<Integer>>(); // list of interfaces is WILD!

        // Here, we are invoking List Methods

        // even if we changed ArrayList to a different type of List - the below methods will still work fine!
        List<String> invokeList = new ArrayList<String>();
//        List<String> invokeList = new LinkedList<String>();
//        List<String> invokeList = new Vector<String>();
        for (int i = 0; i < 20; i++) {
            invokeList.add("Valorant_00" + i);
        }

        // now we query our List
        System.out.println(invokeList);
        System.out.println("This list has " + invokeList.size() + " elements");
        invokeList.remove(7); // remove index 7 // O(n)
        int index = invokeList.indexOf("Valorant_009999"); // O(n)
        boolean hasElement = invokeList.contains("Valorant_009999");    // O(n)

        System.out.println("index search: " + index + ", element has: " + hasElement);


        invokeList.set(9, "Valorant_009999");
        index = invokeList.indexOf("Valorant_009999");
        hasElement = invokeList.contains("Valorant_009999");

        System.out.println("index search: " + index + ", element has: " + hasElement);


        invokeList.clear(); // wipe the list O(n)
        System.out.println(invokeList);

        // Add new element to the end of the list - this has a constant time of O(1) since we know we want to add
        // it at the end
        invokeList.add("LOL_PLayer_1");
        invokeList.add("LOL_PLayer_2");
        System.out.println(invokeList);

        // adding element with index
        invokeList.add(1, "LOL_PLayer_3"); // Linear time O(n) - remember, we ignore constants!
        System.out.println(invokeList);
        System.out.println(invokeList.size());  // O(n)

    }
}
