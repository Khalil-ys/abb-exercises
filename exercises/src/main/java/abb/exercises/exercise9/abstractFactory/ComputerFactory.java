package abb.exercises.exercise9.abstractFactory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ComputerFactory {

    private final ComputerAbstractFactory factory;

    public Computer getComputer(String ram, String hdd, String cpu) {
        return factory.createComputer(ram, hdd, cpu);
    }
}
