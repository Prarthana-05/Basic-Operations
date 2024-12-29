import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform basic arithmetic operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = (num2 != 0) ? (num1 / num2) : Double.NaN;

        // Display results
        System.out.println("\nResults:");
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + addition);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtraction);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiplication);
        if (num2 != 0) {
            System.out.println("Division: " + num1 + " / " + num2 + " = " + division);
        } else {
            System.out.println("Division: Cannot divide by zero!");
        }

        scanner.close();
    }
}
