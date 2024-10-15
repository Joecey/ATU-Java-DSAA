package w3.ie.atu.sw;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class Runner {
    private static final String DICTIONARY_FILE = "./dictionary.txt";
    public static void main(String[] args) throws IOException {

        DictionaryParser dp = new DictionaryParser();

        Instant start = Instant.now();
        List<String> list = dp.getWords(DICTIONARY_FILE);
        Instant end = Instant.now();

        // return as seconds
        System.out.println("Time complexity of O(n) with n = " + list.size() + ": " + Duration.between(start, end));

        start = Instant.now();
        list = dp.getWordsIndex(DICTIONARY_FILE);
        end = Instant.now();

        // return as seconds
        // LinkedList will be fast because head and tail adding is constant time
        System.out.println("Time complexity of O(n) with n (using index) = " + list.size() + ": " + Duration.between(start, end));



    }
}
