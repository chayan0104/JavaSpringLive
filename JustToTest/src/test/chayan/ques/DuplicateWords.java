package test.chayan.ques;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateWords {

    public static void main(String[] args) {
        System.out.println("Type something :");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine().toLowerCase();  // Convert to lowercase for case-insensitive comparison

        String[] words = inputString.split("\\s+");  // Split string into words using whitespace (handles multiple spaces)

        // Create a HashMap to store the frequency of each word
        HashMap<String, Integer> newMap = new HashMap<String, Integer>();
        
        // Iterate over the array of words and count their occurrences
        for (String word : words) {
            if (newMap.containsKey(word)) {  // Check if the word is already in the map
                newMap.put(word, newMap.get(word) + 1);  // Increment the count if it's already in the map
            } else {
                newMap.put(word, 1);  // Add the word with a count of 1 if it's not in the map yet
            }
        }

        // Print the words that have a frequency greater than 1 (i.e., duplicates)
        System.out.println("Duplicate words are:");
        for (String word : newMap.keySet()) {
            if (newMap.get(word) > 1) {  // If the word occurs more than once, it's a duplicate
                System.out.println(word + ": " + newMap.get(word));  // Print the word and its count
            }
        }

        sc.close();  // Close the scanner
    }
}
