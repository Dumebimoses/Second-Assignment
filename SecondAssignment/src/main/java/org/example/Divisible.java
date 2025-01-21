package org.example;

import java.util.Scanner;
public class Divisible {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( " Enter number : ");

        double number = scanner.nextDouble();

        if ( number % 3 ==0 && number % 5 ==0){
            System.out.println(" FizzBuzz");
        } else if ( number % 3 ==0) {
            System.out.println( " Fizz ");
        } else if ( number % 5 ==0) {
            System.out.println(" Buzz ");
        } else{
            System.out.println( " None");
        }
    }
}
