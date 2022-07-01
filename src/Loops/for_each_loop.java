package Loops;//For-each = traversing technique to iterate through the elements in an array/collection.
// Less steps, more readable.
// Less flexible

import java.util.ArrayList;

public class for_each_loop {

    public static void main(String[] args) {

        //String[] animals = {"cat", "dog", "rat", "bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        // use a for-each loop
      //for("data type" index" "in" "collection name") {
        for(String i : animals) {
            System.out.println(i);
        }
    }
}