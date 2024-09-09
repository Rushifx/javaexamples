package setcollections;

import java.util.HashSet;
import java.util.Set;

public class SetsCollection2 {

    public static void main(String[] args) {

        Set<String> names = new HashSet<String>();

        names.add("Santiago");
        names.add("Andres");
        names.add("Camilio");
        names.add("Santiago");
        System.out.println(names);

        // Q: Append the newNames to names using a for-loop
        String newNames[] = {"Jamerson", "Benny", "Maggie"};
        for (int i = 0; i < newNames.length; i++) {
            names.add( newNames[i] );
        }
        System.out.println(names);

        // For each name in names, print out each corresponding name found in the Set "names"
        for (String name: names) {
            System.out.println(name);
        }

        // Q: Use for-each to remove all the values from Set "names"
        // TODO : Use for-each loop to remove all values

        // Declare Set namesCopy and initialise with the values from "names"
        // Use Set namesCopy's built-in method (forEach) to remove each name in Set "names"
         Set<String> namesCopy = new HashSet<String>(names);
         namesCopy.forEach(name->{
            names.remove(name);
         });
         System.out.println(names);

        // Alternatively, use the built-in clear() method to remove all elements in a Set
        // names.clear();
        // System.out.println(names);

        // Q: To append a value to all the names in Set "newNames"
        // TODO : To append a value to all the names in Set "newNames"

        // Use Set nameCopy's built-in method (forEach) to update each name in Set "newNames"
        Set<String> namesCopy2 = new HashSet<String>(names);
        // Use Set namesCopy's built-in method forEach to update each name in "names"
        String toAppendToName = " - To be Confirmed";
        namesCopy2.forEach(name->{
            names.remove(name);
            names.add(name + toAppendToName);
        });
        System.out.println(names);

    }
}
