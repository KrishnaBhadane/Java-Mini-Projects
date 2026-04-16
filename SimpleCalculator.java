import java.util.ArrayList;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        System.out.println("Calculator - ");

        while (true) {
            System.out.print("\nEnter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            String op = sc.next();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean valid = true;

            // Using switch (basic concept)
            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero");
                        valid = false;
                    }
                    break;

                default:
                    System.out.println("Invalid operator!");
                    valid = false;
            }

            if (valid) {
                String output = num1 + " " + op + " " + num2 + " = " + result;
                System.out.println("Result: " + result);

                // Store history using ArrayList
                history.add(output);
            }

            // Show history
            System.out.println("\n Calculation : ");
            for (String h : history) {
                System.out.println(h);
            }

            // Continue or exit
            System.out.print("\nDo you want to continue? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Calculator Closed.");
        sc.close();
    }
}