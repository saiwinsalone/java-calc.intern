import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Java Console Calculator ");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0.0; 
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Error: Cannot divide by zero!");
                    scanner.close();
                    return;
                }
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }

        scanner.close();
        System.out.println("===========================END========");
    }
}
