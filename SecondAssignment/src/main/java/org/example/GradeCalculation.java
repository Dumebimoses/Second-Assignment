package org.example;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {

        // use the scanner class to request input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter student scores : ");

        int scores = scanner.nextInt();

        // use the conditional statements to create logic
        if (scores >= 90) {
            System.out.println(" Grade A");
        } else if (scores >= 75 && scores < 90) {
            System.out.println(" Grade B");
        } else if (scores >= 50 && scores < 75) {
            System.out.println(" Grade C");
        } else {
            System.out.println(" Grade F");
        }

//        int grade = 1;
//        switch (grade) {
//            case 1:
//                System.out.println(" Grade A");
//                break;
//
//            case 2:
//                System.out.println(" Grade B");
//                break;
//        }

    }
}
