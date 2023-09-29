import java.util.Scanner;

public class ATM {
    private static double accountBalance = 1000.00; // Initial account balance
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showWelcomeMessage();
        boolean isRunning = true;

        while (isRunning) {
            showOptions();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    displayTransactionHistory();
                    break;
                case 2:
                    performWithdrawal();
                    break;
                case 3:
                    performDeposit();
                    break;
                case 4:
                    performTransfer();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        System.out.println("Thank you for using the ATM. Goodbye!");
    }

    private static void showWelcomeMessage() {
        System.out.println("Welcome to the ATM Interface");
    }

    private static void showOptions() {
        System.out.println("\nPlease select an option:");
        System.out.println("1. View Transaction History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void displayTransactionHistory() {
        // Implement code to display transaction history here
        System.out.println("Transaction History:");
        // You can fetch and display transaction history from a data source.
    }

    private static void performWithdrawal() {
        System.out.print("Enter the withdrawal amount: ");
        double amount = scanner.nextDouble();

        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. New balance: " + accountBalance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    private static void performDeposit() {
        System.out.print("Enter the deposit amount: ");
        double amount = scanner.nextDouble();
        accountBalance += amount;
        System.out.println("Deposit successful. New balance: " + accountBalance);
    }

    private static void performTransfer() {
        System.out.print("Enter the transfer amount: ");
        double amount = scanner.nextDouble();

        if (amount <= accountBalance) {
            System.out.print("Enter the recipient's account number: ");
            String recipientAccount = scanner.next();
            // Implement code to perform the transfer here
            System.out.println("Transfer successful. New balance: " + accountBalance);
        } else {
            System.out.println("Insufficient funds. Transfer failed.");
        }
    }
}
