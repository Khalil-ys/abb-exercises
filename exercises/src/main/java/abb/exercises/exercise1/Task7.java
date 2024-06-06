package abb.exercises.exercise1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci tərəfi daxil edin: ");
        double a = scanner.nextDouble();
        System.out.print("İkinci tərəfi daxil edin: ");
        double b = scanner.nextDouble();
        System.out.print("Üçüncü tərəfi daxil edin: ");
        double c = scanner.nextDouble();

        if (isValidTriangle(a, b, c)) {
            double perimeter = calculatePerimeter(a, b, c);
            double area = calculateArea(a, b, c);

            System.out.println("Üçbucaq düzgündür.");
            System.out.println("Perimetri: " + perimeter);
            System.out.println("Sahəsi: " + area);
        } else {
            System.out.println("Bu tərəflərlə üçbucaq qurmaq mümkün deyil.");
        }

        scanner.close();
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
