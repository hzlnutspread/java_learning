package Lambdas;

public class Lambdas {
    public static void main(String[] args) {

        // can only be used with certain types of interfaces
        // Interfaces = any class that implements an interface has to provide their own implementations by the methods specified by the interface
        // e.g. 'Printable' interface has a print() method which we will override in the Cat class

        //Cat myCat = new Cat();
        //myCat.print();

        Printable lambdaPrintable = () -> System.out.println("Meow");
        printThing(lambdaPrintable);    // Dont need to send in an object that contains an action.
        // just send in the action itself


    }

    static void printThing(Printable thing) {   // thing can be any object that implements Printable
        thing.print();                          // so above, instead of myCat.print() you can say printThing(myCat)
    }
}

// Lambda is a shortcut to defining an implementation of a functional interface.
// Instead of having to create a class that implements a functional interface and then adding the implementation and creating an object of the class
// You can just create a lambda expression that contains the implementation of the functional interface method
