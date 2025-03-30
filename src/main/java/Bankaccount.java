import java.util.Scanner;

// Custom checked exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


public class Bankaccount {
    private double balance;

    public Bankaccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Withdraw method with custom exception handling
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a bank account with initial balance
        Bankaccount account = new Bankaccount(5000); // Starting balance = 5000

        try {
            // Taking user input for withdrawal amount
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();

            // Attempt to withdraw
            account.withdraw(amount);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Handles negative amounts

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage()); // Handles insufficient balance

        } finally {
            scanner.close(); // Ensures scanner is closed
            System.out.println("Transaction completed.");
        }
    }
}

