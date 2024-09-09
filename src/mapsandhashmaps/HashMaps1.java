package mapsandhashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps1 {

    public static void main(String[] args) {

        // Maps must be made up of a set of key value pair
        Map<Integer, String> map = new HashMap<Integer, String>();

        // To populate data within HashMaps, use the put method (set() method does not exist in Maps or HashMaps)
        map.put(1, "Raymond");
        map.put(2, "Jason");
        map.put(3, "Sammie");
        map.put(4, "Theresa");

        // 1. To traverse or iterate through the map
        // Start with creating a map entrySet() and setting an Iterator object
        Set set = map.entrySet();
        Iterator iterations = set.iterator();

        // Using while loops to iterate through the hashmap
        // through each iteration, we obtain and print out the key:value pair found in the Hashmap called "map"
        while (iterations.hasNext()){
            Map.Entry entry = (Map.Entry)iterations.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        // 2. Using FOR-EACH LOOP to iterate through a HashMap
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // TODO : Use of for-each loop to remove all values
        map.forEach((key, value)->{
            System.out.println(key + " : " + value);
        });

    }

}
