package abb.exercises.exercise1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Reqem daxil edin : ");
        int number = scanner.nextInt();
        int count = countDigits(number);
        System.out.println(number + " ededinin reqem sati: " + count);

        scanner.close();
    }


    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}
