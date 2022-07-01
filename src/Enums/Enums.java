package Enums;

public class Enums {

    public static void main(String[] args) {

        // enum short for enumeration
        // used when you have a predefined set of values that don't change
        // e.g. days of the week, constant. Immutable.

        // can't instantiate a 'new' enum since its constant
        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;

        if (day == DaysOfTheWeek.THURSDAY) {
            System.out.println("almost friday!");
        }

        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
            System.out.println(myDay);
        }

        System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciousness);
        System.out.println(Cereals.FROOT_LOOPS.price);


    }
}

