package Task12.CountOccurrences;

import java.util.HashMap;

public class COMain {
    public static HashMap<String, Integer> countWords(String input) {
        String[] words = input.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }
}
