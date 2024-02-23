package abb.exercises.exercise9.abstractFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public abstract String getRamDyn();
    public abstract String getHddDyn();
    public abstract String getCpuDyn();

    @Override
    public String toString(){
        return "RAM= "+this.getRamDyn()+", HDD="+this.getHddDyn()+", CPU="+this.getCpuDyn();
    }
}
