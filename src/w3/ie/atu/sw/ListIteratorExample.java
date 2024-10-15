package w3.ie.atu.sw;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorExample {
    public static void main(String[] args) {
        /*
         * Here we are testing three ways of traversing a list (using Instant to time iterations)
         * */

        // Method 1 - Iterators
        System.out.println("METHOD 1 - Iterators");
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 1000; i++) {
            list.add("Player_" + i);
        }

        // Create an Iterator object which will be used to stream elements from List
        Iterator<String> i = list.iterator();
        Instant iteratorStart = Instant.now();
        while (i.hasNext()) {
            String element = i.next();
            System.out.println(element);
        }
        Instant iteratorEnd = Instant.now();
        Duration iteratorTime = Duration.between(iteratorStart, iteratorEnd);

        // Method 2 - Indices
        Instant indicesStart = Instant.now();

        for (int j = 0; j < list.size(); j++) {
            String element = list.get(j);
            System.out.println(element);
        }
        Instant indicesEnd = Instant.now();
        Duration indicesTime = Duration.between(indicesStart, indicesEnd);

        // Method 3 - For-loop (uses iterator under the hood)
        Instant forStart = Instant.now();
        for (String element : list) {
            System.out.println(element);
        }
        Instant forEnd = Instant.now();
        Duration forTime = Duration.between(forStart, forEnd);

        // Results!!!
        System.out.println("========== RESULTS =========");

        System.out.println("Iterator Time: " + iteratorTime);
        System.out.println("Indices Time: " + indicesTime);
        System.out.println("For Time: " + forTime);

    }
}
