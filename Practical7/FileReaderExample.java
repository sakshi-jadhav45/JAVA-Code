import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {
        // Change this path to point to where your sample.txt file is actually located
        // For example: "../data/sample.txt" or "C:\\Users\\YourName\\Documents\\sample.txt"
        String filePath = "C:\\Users\\Hu\\Documents\\My Java\\Experiment 7\\simple.txt"; // relative path going one directory up

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            System.out.println("Reading from: " + filePath);
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
