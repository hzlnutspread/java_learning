// Switch = a statement that allows a variable to be tested for equality against a list of values
// Using a lot of "if" statements back to back. More efficient to use switch statements.
// Can check equality of a string


import java.lang.reflect.Array;

public class switches {


    public static void main(String[] args) {

        String[] donkey = {"hello", "donkey", "man", "deer"};
        String day = args[2];

        int x = Integer.parseInt("2");


        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday");
                break;
            case "Monday":
                System.out.println("It is Monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            case "Wednesdsay":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println(day + " is not a day!");

        }

    }
}
