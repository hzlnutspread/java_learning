// printf() =   an optional method to control, format and display text to the console window.
//              two arguments = format string + (object/variable/value)
//              % [flags] [precision] [width] [conversion-character]

public class printf {

    public static void main(String[] args) {

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Sniper Monkey";
        int myInt   = 50;
        double myDouble = 1000;

        //Conversion characters
        System.out.printf("%b\n", myBoolean);
        System.out.printf("%c\n", myChar);
        System.out.printf("%s\n", myString);
        System.out.printf("%d\n", myInt);
        System.out.printf("%f\n", myDouble);

        //[width] = minimum number of chars to be written as output. Written before the conversion character
        System.out.printf("Hello %20s\n", myString);

        //[precision] = number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %.2f\n", myDouble);

        //[flags] = adds effect to output based on the flag added to the format specifier
        //- : left justify
        //+ : output a plus (+) or minus (-) sign for a numeric value
        //0 : numeric values are zero-padded
        //, : comma grouping separator if numbers > 1000
        System.out.printf("You have this much money %20.2f\n", myDouble);
        System.out.printf("You have this much money %020f\n", myDouble);
        System.out.printf("You have this much money %,.2f\n", myDouble);
    }
}