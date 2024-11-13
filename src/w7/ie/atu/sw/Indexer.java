package w7.ie.atu.sw;

/*
This Indexer will be used to index every word in a book and creates an array
of every position that words appears in
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Indexer {
    private Map<String, List<Integer>> idx = new HashMap<String, List<Integer>>();
    private int count; // used to count the current word we are on

    // parse book line by line using function below
    public void makeIndex(String book, String out) throws Exception {
        parseAlt(book);
        writeIndex(out);
    }

    private void parseAlt(String book) throws Exception{
        Files.lines(Paths.get(book)).forEach(text -> {
            try {
                process(text);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    private void parse(String book) throws Exception {  // Imperative parsing
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(book)))) {
            String text;
            while ((text = br.readLine()) != null) {
                process(text);
            }
        }
    }

    private void process(String line) throws Exception {
        String[] words = line.split("\\s+"); // here, we split the line by spaces
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            addWord(word);
        }
    }

    private void addWord(String word) throws Exception {
        // clean up word


        List<Integer> newList;

        if (idx.containsKey(word)) {
            newList = idx.get(word);

        } else {
            newList = new ArrayList<Integer>();
        }
        newList.add(count);
        idx.put(word, newList); // now add the newList in the corresponding word objectKey
        count++;
    }

    // Use this function to write map to file
    private void writeIndex(String out) throws Exception {
        try (FileWriter fw = new FileWriter(out)) {
            Map<String, List<Integer>> temp = new TreeMap<>(idx);

            // now for each map entry - we will write out the key and index array
            for (Map.Entry<String, List<Integer>> entry : temp.entrySet()){
                fw.write(entry.getKey() + "\t" + entry.getValue() + "\n");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Week 7 - Book Indexing");

        new Indexer().makeIndex("./1984.txt", "index.txt");

    }
}
