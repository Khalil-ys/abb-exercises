package abb.exercises.exercise4.exer5;

public class DaysWeek {
    public static void main(String[] args) {

        DaysOfWeek[] daysOfWeek = DaysOfWeek.values();

        for (DaysOfWeek day : daysOfWeek) {
            if (day.isWeekend(day)) {
                System.out.println(day + " is weekend !");
            }
            System.out.println(day);
        }

    }
}
