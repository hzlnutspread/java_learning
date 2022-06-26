/*
 boolean = 1 bit. Primitive data type. True or false value
 byte = 1 byte. Primitive data type. -128 to 127
 short = 2 bytes. Primitive data type. -32,768 to 32,767
 int = 4 bytes. Primitive data type. -2 billion to 2 billion
 long = 8 bytes. Primitive data type. -9 quintillion to 9 quintillion

 float = 4 bytes. Primitive data type. Fractional number up to 6-7 digits e.g. 3.141592f
 double = 8 bytes. Primitive data type. Fractional number up to 15 digits e.g. 3.141592653589793

 char = 2 bytes. Primitive data type. Single character/letter/ASCII value e.g. 'f'
 string = varies. Reference data type. A sequence of chars

 Primitive data types:
    8 types
    Stores data
    Can hold only 1 value
    less memory
    faster

 Reference data types:
    unlimited amount (user defined)
    Stores address
    Can hold more than 1 value
    more memory
    slower
 */


public class variables {

    public static void main(String[] args){

        /*
        int x;      declaration
        x = 123;    assignment
         */

        int x = 123;  //initialisation
        float y = 3.14f;
        boolean z = true;
        char symbol = '@';
        String name = "sniper monkey";

        System.out.println("My Number is: " + x);
        System.out.println("My other Number is: " + y);
        System.out.println(z);
        System.out.println(symbol);
        System.out.println("My name is :" + name);
    }
}
