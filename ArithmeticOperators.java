package com.Ebrain;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticOperators {
	public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
       
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }


    

    public static class Testing {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = 0, b = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Enter first number: ");
                    a = scanner.nextInt();

                    System.out.print("Enter second number: ");
                    b = scanner.nextInt();

                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter two integers.");
                    scanner.nextLine();
                }
            }

            int sum = ArithmeticOperators.sum(a, b);
            System.out.println("Sum: " + sum);

            int difference = ArithmeticOperators.subtract(a, b);
            System.out.println("Difference: " + difference);

            int product = ArithmeticOperators.multiply(a, b);
            System.out.println("Product: " + product);

            try {
                double quotient = ArithmeticOperators.divide(a, b);
                System.out.println("Quotient: " + quotient);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }

            int remainder = ArithmeticOperators.modulus(a, b);
            System.out.println("Remainder: " + remainder);
        }
    }
}
