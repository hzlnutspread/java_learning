package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapsPractice2 {
    public static void main(String[] args) {
        var hashMap = new HashMap<Integer, String>();

        // putting entries into the hashmap
        hashMap.put(23, "HP");
        hashMap.put(12, "Dell");
        hashMap.put(10, "Apple");
        hashMap.put(34, "Asus");

        // Keys and Values for each entry
        System.out.println(hashMap.entrySet());

        // entry is of type Map.Entry<Integer, String>
        // For each entry in the entry set of the hashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -- " + "Value: " + entry.getValue());
        }
    }
}
