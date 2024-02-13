package abb.exercises.exercise5.task1;

public class FullTimeEmployee implements Employee{
    private String name;
    private int id;
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }

    public void displayDetails() {
        System.out.println("Full-Time Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}
