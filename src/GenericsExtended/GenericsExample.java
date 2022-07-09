package GenericsExtended;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {


        // If we have IntegerPrinter and we wanted to create the same thing but for a double we would have to create another class
        // same for String, would have to create a StringPrinter as well for every data type we wanted.
        // You're duplicating the classes but just changing the data type, not efficient

        // Generics allow you to have one class that is flexible for many different types.
        // Create generic class Printer

        IntegerPrinter intPrinter = new IntegerPrinter(52);
        intPrinter.print();

        Printer<Integer, Cat> genericPrinter = new Printer<>(12, new Cat());
        genericPrinter.print();
        // Using this genericPrinter we can delete the other classes (IntegerPrinter etc)

        Printer<Double, Integer> doublePrinter = new Printer<>(33.55, 69);
        doublePrinter.print();

        // Note that generic classes dont work with primitive types. Only works with wrapper classes.

        // An example of using generics is when using ArrayLists
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        // Generics allow you to create classes that can accomodate many different types.
        // Also allow the structure and type-safety of knowing exactly which type your using that class with

        shout("bing", 79);
        shout(52, 56.22231);
        shout(new Cat(), new Dog());

        // Implementing wildcard methods
        // Since you've implemented your method with a wildcard <?> you can use whatever type you want
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);

    }

    // To create a generic method
    // This is how you would have multiple generic types. Can do the same for classes
    // If you want to have a generic return type then say "private static <T, V> T shout() {}
    private static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!!");
        System.out.println(otherThingToShout + "!!!!!");
    }

    // Wildcards
    private static void printList(List<?> myList) { // The question mark is the wild card.
        System.out.println(myList);                 // Its the type parameter when you dont know exactly what the generic type is going to be
    }
    // Can also have bounded wildcards e.g.
    // private static void printList(List<? extends Animal> myList)
}
