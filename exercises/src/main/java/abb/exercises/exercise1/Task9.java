package abb.exercises.exercise1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int number = scanner.nextInt();
        long factorial = calculateFactorial(number);
        System.out.println(number + " ədədinin faktorialı: " + factorial);
        scanner.close();
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
