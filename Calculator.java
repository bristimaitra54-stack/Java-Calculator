import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n===== CALCULATOR MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Choose option (1-4): ");

            int option = sc.nextInt();

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result = 0;
            boolean valid = true;

            switch(option) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    if(b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("❌ Cannot divide by zero");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("❌ Invalid option");
                    valid = false;
            }

            if(valid) {
                System.out.println("✅ Result: " + result);
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using calculator!");
    }
}