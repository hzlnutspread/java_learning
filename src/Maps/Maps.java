package Maps;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args)  {

        // Map = Is a set of key:value pairs
        // Have to use wrapper classes (not primitive)
        // e.g. map an employee to its ID number
        HashMap<String, Integer> empIds = new HashMap<>(); // <> is the diamond operator

        // to add a value to your map
        empIds.put("John", 1234);
        empIds.put("Karl", 54321);
        empIds.put("Jerry", 8675309);

        // Maps don't store a certain order
        // Print our the array
        System.out.println(empIds);

        // To get a value
        System.out.println(empIds.get("Karl"));

        // To see if a certain KEY exists (boolean)
        System.out.println(empIds.containsKey("Jerry"));

        // To see if a certain VALUE exists (boolean)
        System.out.println(empIds.containsValue(6));

        // Inputting the same key with a different value will override the current value
        empIds.put("John", 9999);
        System.out.println(empIds.get("John"));
        System.out.println(empIds);

        // .replace will replace a value that currently exists. If not, nothing will happen
        empIds.replace("John", 6666);
        System.out.println(empIds);

        // .putIfAbsent will only put this in if it doesn't exist. John exists so nothing will happen
        empIds.putIfAbsent("John", 222);
        empIds.putIfAbsent("Steve", 222);
        System.out.println(empIds);

        empIds.remove("Steve");
        System.out.println(empIds);
    }
}
