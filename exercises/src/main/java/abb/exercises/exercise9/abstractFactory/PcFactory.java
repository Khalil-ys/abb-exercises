package abb.exercises.exercise9.abstractFactory;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PcFactory implements ComputerAbstractFactory{

    @Override
    public Computer createComputer(String ram,String hdd,String cpu) {
        return new Pc(ram, hdd, cpu);
    }
}
