package setcollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsCollection3 {

    public static void main(String[] args) {

        // Declare our Set variables of type Integer
        Set<Integer> setA = new HashSet<Integer>();
        Set<Integer> setB = new HashSet<Integer>();

        // Declare arrListA and arrListB to populate setA and setB
        Integer[] arrListA = new Integer[]{1, 2, 3};
        Integer[] arrListB = new Integer[]{3, 4, 5};

        // Initialise values to setA and setB with the arrays created (arrListA and arrListB)
        setA.addAll(Arrays.asList(arrListA));
        setB.addAll(Arrays.asList(arrListB));

        // Obtain the UNION between setA and setB
        Set<Integer> union = new HashSet<Integer>(setA);
        union.addAll(setB);
        System.out.println(union);

        // Obtain the INTERSECTION between setA and setB
        Set<Integer> intersect = new HashSet<Integer>(setA);
        intersect.retainAll(setB);
        System.out.println(intersect);

        // Obtain the DIFFERENCE of setA vs setB
        Set<Integer> difference = new HashSet<Integer>(setA);
        difference.removeAll(setB);
        System.out.println(difference);
    }
}
