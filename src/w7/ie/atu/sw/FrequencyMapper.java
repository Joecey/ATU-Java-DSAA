package w7.ie.atu.sw;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.TreeMap;
import java.util.Map;

public class FrequencyMapper  {
    // TreeMap orders the keys for us
    private final Map<String, Integer> frequencyMap = new TreeMap<String, Integer>();

    public FrequencyMapper (String textFilePath) throws Exception{
        // replacement of the arrow function - you get a cool lambda function variant
        Files.lines(Paths.get(textFilePath)).forEach(this::processLine);
    }

    private void processLine (String line){
        String[] words = line.split("\\s+"); // here, we split the line by spaces
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");

            // skip if string is blank/empty
            if (word.isBlank()) {
                continue;
            }
            addWordToMap(word);
        }
    }

    private void addWordToMap(String word){
        int currentCount = 0;
        String wordTest =  word.toLowerCase();

        if (frequencyMap.containsKey(wordTest)){
            currentCount = frequencyMap.get(wordTest);
        }
        // add +1 to count and append to key-value
        currentCount++;
        frequencyMap.put(wordTest, currentCount);
    }

    public Map<String, Integer> getFrequencyMap() {
        return frequencyMap;
    }
}
