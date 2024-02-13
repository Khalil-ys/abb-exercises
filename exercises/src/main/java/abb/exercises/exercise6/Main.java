package abb.exercises.exercise6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        CustomStorage<HasId> storage = new CustomStorage<>();

        Student student1 = new Student("Aga", 20);
        student1.setId(1);
        storage.addItem(student1);

        Student student2 = new Student("Mammad", 22);
        student2.setId(2);
        storage.addItem(student2);

        Teacher teacher1 = new Teacher("Ahmad", 35);
        teacher1.setId(11);
        storage.addItem(teacher1);

        Teacher teacher2 = new Teacher("Veli", 40);
        teacher2.setId(12);
        storage.addItem(teacher2);

        System.out.println("All Items:");
        storage.displayAllItems();

        System.out.print("Enter student ID number for search: ");
        int id=sc.nextInt();
        System.out.println("\nSearching for ID : "+id);
        HasId foundItem = storage.searchItem(id);
        if (foundItem != null) {
            System.out.println(foundItem);
        } else {
            System.out.println("Item not found.");
        }

        System.out.print("Enter teacher ID number for remove: ");
        id=sc.nextInt();
        sc.close();
        System.out.println("\nRemoving Teacher with ID : "+ id);
        storage.removeItem(teacher2);

        System.out.println("\nAll Items after removal:");
        storage.displayAllItems();
    }
}
