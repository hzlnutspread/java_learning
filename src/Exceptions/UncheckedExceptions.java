package Exceptions;

public class UncheckedExceptions {

    public static void main(String[] args) {

        // Unchecked exceptions don't catch or declare a throw before compiling

        String name = null;
        printLength(name);

    }

    private static void printLength(String myString) {
        try {
            System.out.println(myString.length());
        }
        catch (NullPointerException e) {
            System.out.println("String name cannot be null!");
        }

    }
}

