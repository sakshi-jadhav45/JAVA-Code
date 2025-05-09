import java.util.Scanner;

class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}


class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void balanceEnquiry() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit a negative amount.");
        }
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    public void withdraw(double amount) throws NegativeNumberException, LowBalanceException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw a negative amount.");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
    }
}


public class BankAccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialBalance;

        System.out.print("Enter initial account balance: ₹");
        initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        int choice;
        do {
            System.out.println("\n====== Bank Menu ======");
            System.out.println("1. Balance Enquiry");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        account.balanceEnquiry();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ₹");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ₹");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for using our bank services.");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (NegativeNumberException | LowBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 4);

        scanner.close();
    }
}
