package word;
import java.util.*;

public class WordFrequencyCounter {
    
    public static List<String> getTopNWords(String text, int N) {
        
        //Returns an empty arraylist if the text input is empty
        if (text == null || text.isEmpty() || N <= 0) {
            return new ArrayList<>();
        }

        //Converts text to lowercase then removes punctuation using regex
        text = text.toLowerCase().replaceAll("[^a-z\\s]", "");

        //Splits the text into words, stored in a string list
        String[] words = text.split("\\s+");

        //Creates a hash map to c
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        //Sorts the List alphabetically and compares the frequency
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordFrequency.entrySet());
        sortedEntries.sort((a, b) -> {
            int freqCompare = b.getValue().compareTo(a.getValue());
            return freqCompare != 0 ? freqCompare : a.getKey().compareTo(b.getKey());
        });

        // Return the top N words
        List<String> result = new ArrayList<>();
        for (int i = 0; i < Math.min(N, sortedEntries.size()); i++) {
            result.add(sortedEntries.get(i).getKey());
        }
        return result;
    }

    private static void testBasicFunction() {
        String text = "Java is great. Java is popular. Java is powerful and Java is fun!";
        int N = 2;
        System.out.println("Input: text=\"" + text + "\", N=" + N);
        System.out.println("Output: " + WordFrequencyCounter.getTopNWords(text, N));
        System.out.println();
    }

    private static void testCaseSensitivity() {
        String text = "javA jaVa jAva Java JAva jaVA";
        int N = 1;
        System.out.println("Input: text=\"" + text + "\", N=" + N);
        System.out.println("Output: " + WordFrequencyCounter.getTopNWords(text, N));
        System.out.println();
    }

    private static void testPunctuation() {
        String text = "Java yay! Java? Yay? Java, Yay! java YAY.";
        int N = 2;
        System.out.println("Input: text=\"" + text + "\", N=" + N);
        System.out.println("Output: " + WordFrequencyCounter.getTopNWords(text, N));
        System.out.println();
    }

    private static void testAlphabeticalOrder() {
        String text = "a b c c a b d e f";
        int N = 3;
        System.out.println("Input: text=\"" + text + "\", N=" + N);
        System.out.println("Output: " + WordFrequencyCounter.getTopNWords(text, N));
        System.out.println();
    }

    private static void testEmptyText() {
        String text = "";
        int N = 5;
        System.out.println("Input: text=\"" + text + "\", N=" + N);
        System.out.println("Output: " + WordFrequencyCounter.getTopNWords(text, N));
        System.out.println();
    }

    private static void testZeroN() {
        String text = "hello world";
        int N = 0;
        System.out.println("Input: text=\"" + text + "\", N=" + N);
        System.out.println("Output: " + WordFrequencyCounter.getTopNWords(text, N));
        System.out.println();
    }

    private static void testFewerN() {
        String text = "one two three";
        int N = 5;
        System.out.println("Input: text=\"" + text + "\", N=" + N);
        System.out.println("Output: " + WordFrequencyCounter.getTopNWords(text, N));
        System.out.println();
    }

    public static void main(String[] args) {
        testBasicFunction();
        testCaseSensitivity();
        testPunctuation();
        testAlphabeticalOrder();
        testEmptyText();
        testZeroN();
        testFewerN();
    }
}