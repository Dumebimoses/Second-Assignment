package org.example;

import java.util.Scanner;

public class QuestionThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter first number: ");

        double number1 = scanner.nextDouble();

        System.out.print("Enter second number: ");

        double number2 = scanner.nextDouble();

        if (number1 > number2) {
            System.out.println("The larger number is: " + number1);
        } else if (number2 > number1) {
            System.out.println("The larger number is: " + number2);
        } else {
            System.out.println("Both numbers are equal.");
        }

    }


}
