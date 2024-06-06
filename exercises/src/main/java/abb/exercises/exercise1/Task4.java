package abb.exercises.exercise1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci reqemi daxil edin : ");
        int firstNumber = scanner.nextInt();
        System.out.print("İkinci reqemi daxil edin : ");
        int secondNumber = scanner.nextInt();
        System.out.println("Yer deyismeden evvel: firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("Yer deyisdikden sonra: firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);
        scanner.close();
    }
}
