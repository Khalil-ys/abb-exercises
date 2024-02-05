package abb.exercises.exercise4.exer4;

import java.util.Scanner;

public class PhoneNumberFormatChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number: ");
        String number=sc.nextLine();
        PhoneNumber phoneNumber =new PhoneNumber(number);
        phoneNumber.getPhoneNumber();


    }
}
