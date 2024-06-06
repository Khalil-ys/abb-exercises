package abb.exercises.exercise1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir reqem daxil edin : ");
        int number = scanner.nextInt();
        int sum = calculateSumOfDigits(number);
        System.out.println(number + " reqeminin ededleri cemi : " + sum);
        scanner.close();
    }

    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;

    }
}
