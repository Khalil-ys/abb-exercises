package abb.exercises.exercise1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir reqem daxil edin : ");
        int givenNumber = scanner.nextInt();
        System.out.println("0-dan " + givenNumber + " -e qeder sade ededler:");
        for (int num = 3; num <= givenNumber; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
