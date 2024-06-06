package abb.exercises.exercise1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Reqem daxil edin : ");
        int givenNumber = scanner.nextInt();

        for (int num = 0; num < givenNumber; num++) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }

}
