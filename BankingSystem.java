import java.util.*;

class BankAccount {
    int accNo;
    String name;
    double balance;

    BankAccount(int accNo, String name) {
        this.accNo = accNo;
        this.name = name;
        this.balance = 0;
    }
}

public class BankingSystem {
    static ArrayList<BankAccount> accounts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== BANKING SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1: createAccount(); break;
                case 2: deposit(); break;
                case 3: withdraw(); break;
                case 4: checkBalance(); break;
                case 5: System.out.println("Thank you!"); break;
                default: System.out.println("Invalid choice");
            }

        } while(choice != 5);
    }

    static BankAccount findAccount(int accNo) {
        for(BankAccount acc : accounts) {
            if(acc.accNo == accNo) return acc;
        }
        return null;
    }

    static void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        accounts.add(new BankAccount(accNo, name));
        System.out.println("Account created successfully!");
    }

    static void deposit() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo);

        if(acc != null) {
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            acc.balance += amount;
            System.out.println("Deposited successfully!");
        } else {
            System.out.println("Account not found!");
        }
    }

    static void withdraw() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo);

        if(acc != null) {
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            if(acc.balance >= amount) {
                acc.balance -= amount;
                System.out.println("Withdrawal successful!");
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Account not found!");
        }
    }

    static void checkBalance() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo);

        if(acc != null) {
            System.out.println("Balance: " + acc.balance);
        } else {
            System.out.println("Account not found!");
        }
    }
}