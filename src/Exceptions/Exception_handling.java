package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_handling {

    public static void main(String[] args) {

        // exception = events that occur during execution of a program that disrupts normal flow of instructions
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result: " + z);
        }
        catch(ArithmeticException e) {
            System.out.println("You can't divide by 0, dumbass!");

        }
        catch(InputMismatchException e) {
            System.out.println("You have to enter a number!");
        }
        catch(Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
        }


    }
}
