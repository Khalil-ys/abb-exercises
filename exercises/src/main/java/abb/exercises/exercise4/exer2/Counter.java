package abb.exercises.exercise4.exer2;

import lombok.Getter;

public class Counter {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        System.out.println("Instance count: " + Counter.getInstanceCount());
    }
    @Getter
    private static int instanceCount = 0;

    public Counter() {
        instanceCount++;
    }

}
