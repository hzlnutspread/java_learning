/*
ArrayList = a resizable array
elements can be added and removed after compilation phase
Store reference data types
 */

import java.util.ArrayList;

public class array_list {

    public static void main(String[] args) {

        ArrayList<String> foods = new ArrayList<>();

        foods.add("pizza");
        foods.add("hamburger");
        foods.add("hotdog");

        foods.set(0, "sushi");
        foods.remove(2);
        foods.clear();


        for(int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i));
        }
    }
}
