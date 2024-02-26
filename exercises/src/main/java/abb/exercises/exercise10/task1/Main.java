package abb.exercises.exercise10.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            try {
                System.out.print("Enter number : ");
                int i = Integer.parseInt(sc.next());
                int square=i*i;
                System.out.println("Square : "+square);
                break;
            }catch (NumberFormatException e){
                System.out.println("Not an integer : "+e.getMessage());
            }
        }
        sc.close();
    }
}
