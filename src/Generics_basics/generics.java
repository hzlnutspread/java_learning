package Generics_basics;

public class generics {

    public static void main(String[] args) {

        // generics =   enable types (classes and interfaces) to be parameters when defining:
        //              classes, interfaces and methods
        //              A benefit is it eliminate the need to create multiple versions of methods or classes for
        //              various data types.
        //              Use 1 version for all reference data types

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);
        //this is annoying because we need to create four different methods for the 4 reference data types
        //we can just create one by doing the below]

    }

    //T is the conventional letter to use.
    public static <T> void displayArray(T[] array) {

        for (T x : array) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }
    //basically, the T can stand for Integer, String, Character or Double (any reference type)

//    public static void displayArray(Integer[] array) {
//
//        for (Integer x : array) {
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    }
//
//    public static void displayArray(Double[] array) {
//
//        for (Double x : array) {
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    }
//
//    public static void displayArray(Character[] array) {
//
//        for (Character x : array) {
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    }
//
//    public static void displayArray(String[] array) {
//
//        for (String x : array) {
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    }

}
