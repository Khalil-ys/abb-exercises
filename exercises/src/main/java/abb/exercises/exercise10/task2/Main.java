package abb.exercises.exercise10.task2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        OutputStream outputStream=new FileOutputStream("mkcd.txt");
        Scanner sc=new Scanner(System.in);
        while (true){
            try {
                System.out.print("Enter your age : ");
                int age=sc.nextInt();
                checkAge(age);
                System.out.println("Age is valid : "+age);
                break;
            }catch (InvalidInputException e){
                System.out.println("Invalid input : "+e.getMessage());
            }
        }
        sc.close();
    }
    public static void checkAge(int age) throws InvalidInputException{
        if (age<10 || age>30){
            throw new InvalidInputException("Age must be between 10 and 30");
        }
    }
}
