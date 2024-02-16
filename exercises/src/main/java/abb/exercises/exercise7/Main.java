package abb.exercises.exercise7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Aga", 6, 1000));
        employees.add(new FullTimeEmployee("Mamed", 1, 1200));
        employees.add(new PartTimeEmployee("Ali", 4, 15, 20));
        employees.add(new PartTimeEmployee("Veli", 2, 10, 1000));

        Map<String, Double> salaryMap = new HashMap<>();
        ArrayList<Employee> filterEmployees = new ArrayList<>();

        for (Employee emp : employees) {
            if (emp.getExperience() > 2) {
                filterEmployees.add(emp);
            }
        }

        filterEmployees.sort(Comparator.comparingInt(Employee::getExperience));

        if (!filterEmployees.isEmpty()) {
            double maxSalary = Double.MIN_VALUE;
            double minSalary = Double.MAX_VALUE;
            for (Employee emp : filterEmployees) {
                if (emp instanceof FullTimeEmployee) {
                    double salary = ((FullTimeEmployee) emp).getSalary();
                    if (salary > maxSalary) {
                        maxSalary = salary;
                    }
                    if (salary < minSalary) {
                        minSalary = salary;
                    }
                } else if (emp instanceof PartTimeEmployee) {
                    double salary = ((PartTimeEmployee) emp).calculateSalary();
                    if (salary > maxSalary) {
                        maxSalary = salary;
                    }
                    if (salary < minSalary) {
                        minSalary = salary;
                    }
                }
            }
            salaryMap.put("maxSalary", maxSalary);
            salaryMap.put("minSalary", minSalary);

            for (Map.Entry<String, Double> entry : salaryMap.entrySet()) {
                System.out.println("K=> " + entry.getKey() + " V=> " + entry.getValue());
            }


        }
    }
}
