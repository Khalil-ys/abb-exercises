package abb.exercises.exercise9.abstractFactory;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ServerFactory implements ComputerAbstractFactory{

    @Override
    public Computer createComputer(String ram, String hdd, String cpu) {
        return new Server(ram, hdd, cpu);
    }
}
