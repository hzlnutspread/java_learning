// string = reference data type that can store one or more characters
// Reference data types have access to useful methods.

import java.util.Locale;

public class string_methods {

    public static void main(String[] args) {

        String name = "Sniper Monkey";

        //boolean result = name.equalsIgnoreCase("sniper Monkey");
        //int result = name.length();
        //char result = name.charAt(2);
        //int result = name.indexOf("S");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        String result = name.replace('o', 'a');

        System.out.println(result);


    }
}
