package mapsandhashmaps;

import java.util.HashMap;
import java.util.Map;

public class HashMaps2 {

    public static void main(String[] args) {

        // Declare a HashMap and initialise it with values
        Map<String, String> customersAddressMap = new HashMap<String, String>(){
            {
                put("Jason Ong", "Address 1");
                put("Alex Lim", "Address 2");
                put("Samantha Lee", "Address 3");
                put("Carlos Yip", "Address 4");
            }
        };

        // We can refer to the size() to determine the total number that exists within the Hashmap
        int customerMapSize = customersAddressMap.size();
        System.out.println("Total Number of customers: " + customerMapSize);

        // Verify whether the map contains a particular Key
        boolean containsKey = customersAddressMap.containsKey("Jason Ong");
        System.out.println(containsKey);

        // Verify whether the map contains a value
        boolean containsAddress = customersAddressMap.containsValue("Address 1");
        System.out.println(containsAddress);

        // To use the get() method of a Hashmap to obtain the values within
        System.out.println(customersAddressMap.get("Carlos Yip"));

        // To use the remove() method to remove a value from a Hashmap based on the Key
        customersAddressMap.remove("Carlos Yip");
        System.out.println(customersAddressMap);

        // TODO: compare by setting all values to lower case first before checking
        // Rather than use containsKey, user contains to set the compared value to lower or uppercase
        boolean containsAddressLowerCase = customersAddressMap.toString().toLowerCase().contains("address 1");
        System.out.println(containsAddressLowerCase);
    }
}
