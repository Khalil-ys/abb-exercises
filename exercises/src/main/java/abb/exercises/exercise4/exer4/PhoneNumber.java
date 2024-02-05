package abb.exercises.exercise4.exer4;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class PhoneNumber {
    Scanner sc = new Scanner(System.in);

    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
    }

    public void setPhoneNumber(String phoneNumber) {
        String regex = "\\+994\\s?(50|51|55)\\s?\\d{3}\\s?\\d{2}\\s?\\d{2}";
        boolean matches = phoneNumber.matches(regex);
        if (!matches) {
            System.out.println("Enter the number correctly Example : +994 50 123 45 67");
            String s = sc.nextLine();
            setPhoneNumber(s);
        } else {
            this.phoneNumber = phoneNumber;
            System.out.println("Phone number is valid!");
        }
    }
}
