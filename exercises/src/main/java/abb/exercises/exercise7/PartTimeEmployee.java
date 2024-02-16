package abb.exercises.exercise7;

public class PartTimeEmployee extends Employee{

    private int hoursWorked;
    private double hourlySalary;

    public PartTimeEmployee(String name, int experience, int hoursWorked, double hourlySalary) {
        super(name, experience);
        this.hoursWorked = hoursWorked;
        this.hourlySalary = hourlySalary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public double calculateSalary() {
        return hourlySalary * hoursWorked;
    }
}
