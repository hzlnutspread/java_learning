package NullPointerExceptions;

import java.util.ArrayList;
import java.util.List;

public class NullPointerExceptions {
    public static void main(String[] args) {

        // myCat variable isn't a Cat object itself, its a reference to a Cat object in memory.
        // When we instantiate the myCat variable to a new Cat, the myCat variable is now a reference to an actual Cat in memory
        // If we set myCat to null, then its reference is not to an object, but nothing. Not even an empty box with no Cat in it. This is a null pointer.
        Cat myCat = null;       // try to initialise it properly without usingn 'null'    i.e. new Cat
        if (myCat != null) {
            myCat.makeNoise();  // common null check
        }


        Boolean shouldPrintHello = null;        // Boolean will give nullPointerException.
        if (shouldPrintHello) {                 // Try to use 'boolean' (primitive) where ever possible since its only true or false.
            System.out.println("Hello");
        }

        List<String> favouriteCheeseburgers = null;
        for (String burger : favouriteCheeseburgers) {  // another null pointer exception here
            System.out.println(burger);                 // Best practice to initialise it as new ArrayList<>() instead or empty list.
        }

    }



    private static int getFirstCatNameLength (List<Cat> cats) {

        if (cats != null &&
                cats.get(0) != null &&
                cats.get(0).getName() != null) {
            return cats.get(0).getName().length();
        }
        return 0;
    }

    private static List<Cat> getCats() {

        return new ArrayList<>(); // instead of using return null;

    }
}
