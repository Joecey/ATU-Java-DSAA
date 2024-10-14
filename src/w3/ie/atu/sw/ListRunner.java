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

    }
}
