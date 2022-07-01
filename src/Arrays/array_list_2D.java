package Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class array_list_2D {

    // 2D array list is a dynamic list of lists
    // You can change the size of these lists during runtime.

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic bread");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Tomatoes");
        produceList.add("Zucchini");
        produceList.add("Peppers");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Soda");
        drinksList.add("Coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(1).get(0));
    }
}
