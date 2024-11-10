package w7.ie.atu.sw;

import java.util.*;

public class MapRunner {
    private Map<String, Integer> table = new HashMap<String, Integer>();
    public void  process(String[] words) {
        System.out.println("Map Runner");
        for (String word: words){
            String lcword = word.toLowerCase();
            int frequency = 1;
            if (table.containsKey(lcword)){ // O(1)
                frequency = table.get(lcword);
                frequency++;
            }
            table.put(lcword, frequency); // O(1)

        }
        System.out.println(table);

        // now it is in sorted order
        Map<String, Integer> sortedMap = new TreeMap<String, Integer>(table);
        System.out.println(sortedMap);

        Set<String> keys  = table.keySet();
        for (String key: keys){
            int number = table.get(key);
        }

        Collection<Integer> values = table.values();
        for (Integer val : values){
            System.out.println(val);
        }
    }
    public static void main(String[] args) {
        new MapRunner().process(args);
    }
}
