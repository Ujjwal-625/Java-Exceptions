import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample array
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Taking user input for index
            System.out.print("Enter the index: ");
            int index = scanner.nextInt();

            try {
                // Accessing the element at the given index
                int value = numbers[index];

                // Taking user input for divisor
                System.out.print("Enter the divisor: ");
                int divisor = scanner.nextInt();

                try {
                    // Performing division
                    int result = value / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } finally {
            scanner.close(); // Closing scanner
            System.out.println("Operation completed.");
        }
    }
}
