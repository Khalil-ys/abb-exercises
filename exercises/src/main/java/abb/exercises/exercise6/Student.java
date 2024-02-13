package abb.exercises.exercise6;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student implements HasId{
    private int id;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.id = 0;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}
