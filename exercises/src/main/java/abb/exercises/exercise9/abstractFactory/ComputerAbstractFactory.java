package abb.exercises.exercise9.abstractFactory;

public interface ComputerAbstractFactory {

    Computer createComputer(String ram, String hdd, String cpu);
}
