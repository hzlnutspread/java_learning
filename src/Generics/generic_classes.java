package Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class generic_classes {

    public static void main(String[] args) {

        // instead of doing this four different times we can do it once as shown below with MyGenericClass
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.1415);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Hello");


        //Refresher on how to use ArrayLists
        //Very similar to how you create generic classes cuz of the angle brackets
        //ArrayLists use generic class to store different reference data types
        ArrayList<String> myFriends = new ArrayList<>();

        //The generic class with two parameters (T, V) are similar to hashmaps which store key: value pairs.
        HashMap<Integer, String> users = new HashMap<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        //dont forget to put the angle brackets here to show what kind of value should be expected.
        MyGenericClass<Integer, Integer> genericPair = new MyGenericClass<>(15, 20);
        MyGenericClass<String, Integer> genericPair2 = new MyGenericClass<>("Bing Bong", 20);


        System.out.println(genericPair.getValueT());
        System.out.println(genericPair.getValueV());

        System.out.println(genericPair2.getValueT());
        System.out.println(genericPair2.getValueV());

    }
}
