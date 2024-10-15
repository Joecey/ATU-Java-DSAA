package w3.ie.atu.sw;

import java.io.*;
import java.util.*;

public class DictionaryParser {


    public List<String> getWords(String file) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        // get each word from dictionary
        String word;

        List<String> words = new ArrayList<String>();
//        List<String> words = new LinkedList<String>();

        while ((word = br.readLine()) != null){
            words.add(word);
        }
        return words;
    }

    public List<String> getWordsIndex(String file) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        // get each word from dictionary
        String word;

//        List<String> words = new ArrayList<String>();
        List<String> words = new LinkedList<String>();

        while ((word = br.readLine()) != null){
            words.add(0, word); // shift elements and add at index
        }
        return words;
    }
}
