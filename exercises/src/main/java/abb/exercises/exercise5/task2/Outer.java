package abb.exercises.exercise5.task2;

import lombok.Getter;
import lombok.Setter;


public class Outer {
    public static void main(String[] args) {
        Inner in=new Inner();
        Inner in1=new Inner();
        Inner in2=new Inner();
        Inner in3=new Inner();
        Inner in4=new Inner();
        Inner in6=new Inner();
        Inner in7=new Inner();
        System.out.println("Number of instances created: " + Inner.getCount());
    }
    @Getter
    private static class Inner {
        private static int count = 0;
        Inner() {
            count++;
        }
        public static int getCount(){
            return count;
        }
    }
}
