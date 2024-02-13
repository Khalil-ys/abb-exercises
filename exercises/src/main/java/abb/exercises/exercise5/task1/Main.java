package abb.exercises.exercise5.task1;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new FullTimeEmployee("Aga Agayev", 1, 500);
        employees[1] = new FullTimeEmployee("Ali Aliyev", 2, 600);
        employees[2] = new PartTimeEmployee("Mammad Mammadov", 3, 15, 30);
        employees[3] = new PartTimeEmployee("Veli Veliyev", 4, 10, 40);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary() + " manat");
            System.out.println();
        }
    }
}
