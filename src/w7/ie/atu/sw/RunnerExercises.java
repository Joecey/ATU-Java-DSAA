package w7.ie.atu.sw;

import java.util.*;


public class RunnerExercises {
    public static void main(String[] args) throws Exception {
        System.out.println("Week 7 - Exercises");
        System.out.println("Some exercises have text only answers and will be answered with comments");

        // Exercise 1
        Set<Float> treeFloat = new TreeSet<Float>();
        Set<String> treeString = new TreeSet<String>();

        // Here, these two will naturally give errors as there is no element that can
        // be compared. To remedy this, we need to implement a comparable
        Set<Student> treeStudent = new TreeSet<Student>();
        Set<Ninja> treeNinja = new TreeSet<Ninja>();

        Set<Float> hashFloat = new HashSet<Float>();
        Set<String> hashString = new HashSet<String>();
        Set<Student> hashStudent = new HashSet<Student>();
        Set<Ninja> hashNinja = new HashSet<Ninja>();

        // Exercise 2
        // adding an element to a hashSet is O(1), while to a TreeSet is O(log(n))
        treeString.add("New String");
        hashString.add("New String 2");
        treeString.add("John Dee");
        hashString.add("Boo Belvings");
        treeString.add("New Jeans");
        hashString.add("Blackpink");

        // no concept of index, but allows for instance search and removal.
        // thus time complexity if O(1)
        treeString.remove("New String");
        hashString.remove("Boo Belvings");

        // adding a collection of elements is equal to the length of the collection O(n)

        // searching for a set if O(1)

        // and i got lazy with the rest of them here...

        // Exercise 3
        Iterator<String> i = treeString.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Iterator<String>  j = hashString.iterator();
        while(j.hasNext()){
            System.out.println(j.next());
        }

        // Exercise 4
        // again you know how to make maps - i'm just lazy to write this here lol

        // Exercise 5
        // see indexer example for all the methods --- it's a hasMap, you got this

        // Exercise 6 - The file parser
        // now here's an actual GOOD one
        FrequencyMapper mapper = new FrequencyMapper("./1984.txt");

        // process and return the frequency map - displaying every key value pair
        Map<String, Integer> completeMap = mapper.getFrequencyMap();

        for(String key: completeMap.keySet()){
            System.out.printf("%s: %d%n", key, completeMap.get(key));
        }
    }
}
