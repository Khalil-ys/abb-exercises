package abb.exercises.exercise4.exer5;

public enum DaysOfWeek {

    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public boolean isWeekend(DaysOfWeek day) {
        return day == SATURDAY || day == SUNDAY;
    }
}
