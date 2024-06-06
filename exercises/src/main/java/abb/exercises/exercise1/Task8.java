package abb.exercises.exercise1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci rəqəmi daxil edin: ");
        double a = scanner.nextDouble();

        System.out.print("İkinci rəqəmi daxil edin: ");
        double b = scanner.nextDouble();

        System.out.print("Əməli daxil edin (+, -, *, /, %): ");
        char operation = scanner.next().charAt(0);

        double result;
        switch (operation) {
            case '+':
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Sıfıra bölmə xətası!");
                }
                break;
            case '%':
                if (b != 0) {
                    result = a % b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Sıfıra bölmə xətası!");
                }
                break;
            default:
                System.out.println("Yanlış əməl daxil edildi!");
                break;
        }

        scanner.close();
    }
}
