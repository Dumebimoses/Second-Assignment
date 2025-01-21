package org.example;

import java.util.Scanner;

public class EligibleVoter {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println(" Please input your age: ");

        int age = scanner.nextInt();

        if ( age>= 18){
            System.out.println(" You are eligible to vote ");
        } else{
            int i = 18 - age;
            System.out.println(" You're ineligible to vote. ");
            System.out.println(" You have " +i + " years until you are eligible to vote");
        }
    }
}
