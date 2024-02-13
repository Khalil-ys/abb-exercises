package abb.exercises.exercise6;

public class Teacher implements HasId{

    private int id;
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.id = 0;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Teacher ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}
