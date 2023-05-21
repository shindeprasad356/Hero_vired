import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0.0;

        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }

        System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);
    }
}