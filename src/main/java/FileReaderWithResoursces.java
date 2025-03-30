import java.io.*;

public class FileReaderWithResoursces {
    public static void main(String[] args) {
        String fileName = "info.txt";

        // Using try-with-resources to auto-close BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String firstLine = reader.readLine(); // Read the first line

            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
