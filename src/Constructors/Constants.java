package Constructors;

public class Constants {
    // if you want a class without ANY constructors at all
    // static, so can use any of them without creating an object. So dont need constructors but can still create objects of it.
    // to prevent creating objects of constants you create the no args constructor manually and set it private.

    private Constants() {

    }

    public static final int NUMBER_OF_MONTHS_IN_A_YEAR = 365;

    public static final int NUMBER_OF_DAYS_IN_A_WEEK = 7;

    public static final String MY_NAME = "John";

}
