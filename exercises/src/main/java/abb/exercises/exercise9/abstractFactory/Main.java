package abb.exercises.exercise9.abstractFactory;

public class Main {

    public static void main(String[] args) {
//        PcFactory pcFactory = new PcFactory();
//        ServerFactory serverFactory = new ServerFactory();
        ComputerFactory computerServerFactory = new ComputerFactory(Server::new);
        ComputerFactory computerPsFactory = new ComputerFactory(Pc::new);
        Computer server = computerServerFactory.getComputer("6", "500", "8");
        Computer pc = computerPsFactory.getComputer("8", "128", "4");
        System.out.println(server);
        System.out.println();
        System.out.println(pc);

    }
}
