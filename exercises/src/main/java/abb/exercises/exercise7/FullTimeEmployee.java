package abb.exercises.exercise7;

public class FullTimeEmployee extends Employee{

    private double salary;

    public FullTimeEmployee(String name,int experience,double salary){
        super(name,experience);
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

}
