package org.example;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Check if the number is positive, negative, or zero using the else-if statements
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

    }
}
