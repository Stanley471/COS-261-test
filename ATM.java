import java.util.Scanner;

public class ATM {
    private static double balance = 1000.00; // Initial balance
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Welcome to Simple ATM ===");
        
        while (true) {
            printMenu();
            int choice = getIntInput("Enter your choice (1-4): ");
            
            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> depositMoney();
                case 3 -> withdrawMoney();
                case 4 -> {
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }

    private static void checkBalance() {
        System.out.printf("\nYour current balance: $%.2f%n", balance);
    }

    private static void depositMoney() {
        System.out.println("\n=== Deposit Money ===");
        double amount = getPositiveDoubleInput("Enter amount to deposit: $");
        
        if (amount > 0) {
            balance += amount;
            System.out.printf("$%.2f deposited successfully.%n", amount);
            System.out.printf("New balance: $%.2f%n", balance);
        } else {
            System.out.println("Invalid amount. Deposit canceled.");
        }
    }

    private static void withdrawMoney() {
        System.out.println("\n=== Withdraw Money ===");
        double amount = getPositiveDoubleInput("Enter amount to withdraw: $");
        
        if (amount <= 0) {
            System.out.println("Invalid amount. Withdrawal canceled.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal canceled.");
        } else {
            balance -= amount;
            System.out.printf("$%.2f withdrawn successfully.%n", amount);
            System.out.printf("Remaining balance: $%.2f%n", balance);
        }
    }

    // Helper methods
    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number (1-4).");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }

    private static double getPositiveDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = scanner.nextDouble();
                if (value >= 0) {
                    return value;
                }
                System.out.println("Amount must be positive.");
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
}