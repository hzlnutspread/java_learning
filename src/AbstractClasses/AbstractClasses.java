package AbstractClasses;

public class AbstractClasses {
    public static void main(String[] args) {

        // Abstract class = class you can't instantiate. Can't create objects

        Cat myCat = new Cat();
        myCat.makeNoise();
        System.out.println(myCat);

    }
}

// Difference between interface and abstract class
// Can implement as many interfaces as you want in java
// Can only extend one class

// Interfaces have static final fields, so you have to instantiate them with a value.
// This means the same values apply to every object in that class
// But abstract classes can create objects of different field values

// Create abstract class if you have lots of closely related classes with similar functionality and fields
// Create interface if you have a lot of unrelated classes that you all want to be able to do a certain thing

