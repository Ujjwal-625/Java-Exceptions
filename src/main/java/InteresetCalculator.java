public class InteresetCalculator {

    // Method to calculate interest with exception propagation
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive.");
        }
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        try {
            // Test case with valid values
            double interest = calculateInterest(5000, 5, 3);
            System.out.println("Calculated Interest: " + interest);

            // Test case with invalid values (triggers exception)
            double invalidInterest = calculateInterest(-1000, 4, 2);
            System.out.println("Calculated Interest: " + invalidInterest);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
