package abb.exercises.exercise9.abstractFactory;


import lombok.ToString;

@ToString(callSuper = true)
public class Server extends Computer {

    public Server(String ram, String hdd, String cpu) {
        super(ram, hdd, cpu);
    }

    @Override
    public String getRamDyn() {
        return this.getRam();
    }

    @Override
    public String getHddDyn() {
        return this.getHdd() ;
    }

    @Override
    public String getCpuDyn() {
        return this.getCpu();
    }
}
