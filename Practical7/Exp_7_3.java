import java.io.*;
import java.util.*;

public class Exp_7_3 {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "prachi.txt"; // Change this to your file's path

        // Initialize counters
        int vowelCount = 0;
        int wordCount = 0;
        int aCount = 0;

        try {
            // Create a BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            // Read each line of the file
            while ((line = reader.readLine()) != null) {
                // Count vowels and 'a'
                for (char ch : line.toCharArray()) {
                    if (isVowel(ch)) {
                        vowelCount++;
                    }
                    if (ch == 'a' || ch == 'A') {
                        aCount++;
                    }
                }

                // Count words by splitting the line by spaces
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            // Close the reader
            reader.close();

            // Print the results
            System.out.println("Total number of vowels: " + vowelCount);
            System.out.println("Total number of words: " + wordCount);
            System.out.println("Number of times 'a' appears: " + aCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        char lowerCh = Character.toLowerCase(ch);
        return lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u';
    }
}
