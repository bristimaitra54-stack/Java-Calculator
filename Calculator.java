import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        System.out.println("Choose operation (+ - * /):");
        char op = sc.next().charAt(0);

        double result;

        switch(op) {
            case '+':
                result = a + b;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = a - b;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = a * b;
                System.out.println("Result: " + result);
                break;

            case '/':
                if(b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid operation");
        }
    }
}