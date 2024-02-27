package abb.exercises.exercise10.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                extracted(sc);
                break;
            } catch (FormatException e) {
                System.out.println("Not an integer : " + e.getMessage());
            }
        }
        sc.close();
    }

    private static void extracted(Scanner sc) {
        System.out.print("Enter number : ");
        try {
            int i = Integer.parseInt(sc.next());
            int square = i * i;
            System.out.println("Square : " + square);
        } catch (Exception e) {
            throw new FormatException("Format");
        }
    }
}
