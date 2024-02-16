package abb.exercises.exercise5.task1;


public class PartTimeEmployee implements Employee{

    private String name;
    private int id;
    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void displayDetails() {
        System.out.println("Part-Time Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Monthly Salary: " + calculateSalary());
    }
}
