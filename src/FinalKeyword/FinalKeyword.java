package FinalKeyword;

public class FinalKeyword {

    // Create final constants here
    // Can use this in the Dog class too
    // Convention for constants are all caps separated by _
    public static final double PI = 3.14159;

    public static void main(String[] args) {

        // Final variable is a variable you can only assign one time
        // So this dog can only be assigned one time
        // Main use is to create constants e.g. need the value of pi.
        final Dog myDog = new Dog();
        myDog.eat();

        // myDog = new Dog();       // Can't do this cuz myDog is final

        //final double pi = 3.14159;  // someone could set pi to something else which is stupid
        System.out.println(PI * 3);

    }
}
