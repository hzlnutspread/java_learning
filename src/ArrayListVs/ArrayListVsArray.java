package ArrayListVs;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListVsArray {
    public static void main(String[] args) {

        // Array
        // Size never changes
        // Can hold primitive and classes
        String[] friendsArray = new String[5];
        // or you can do this
        // String[] friendsArray2 = {"john", "chris", "eric", "luke"};

        //ArrayList
        // Size can change
        // Can only hold objects + wrapper types
        // ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

        // To get element
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList2.get(1));

        // Get length
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList2.size());

        // Add element
        // Cant do this for an array
        friendsArrayList2.add("Donkey");

        // Set an element
        friendsArray[0] = "Harry";
        friendsArrayList2.set(0, "Harry");

        // Remove element
        // Cant do this with array
        friendsArrayList2.remove(2);

        // Print
        System.out.println(Arrays.toString(friendsArray));
        System.out.println(friendsArrayList2);
    }
}
