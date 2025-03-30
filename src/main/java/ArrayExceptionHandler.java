import java.util.Scanner;

public class ArrayExceptionHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array (can be null to test NullPointerException)
        Integer[] numbers = {10, 20, 30, 40, 50};
        // Integer[] numbers = null; // Uncomment this line to test NullPointerException

        try {
            // Take user input for index
            System.out.print("Enter an index: ");
            int index = scanner.nextInt();

            // Retrieve and print the value
            System.out.println("Value at index " + index + ": " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid index.");
        } finally {
            scanner.close();
        }
    }
}
