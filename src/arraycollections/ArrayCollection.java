package arraycollections;

import java.util.Arrays;

public class ArrayCollection {

    public static void main(String[] args) {

        // Determine the different approaches in declaring and initialising an array

        // 1. Declare an array called myArray that is initialised with values 1 to 3
        int[] myArray = new int[]{1, 2, 3};
        System.out.println(myArray.length);

        // 2. Declare an array called myArray2 with 3 values 1 to 3
        int[] myArray2 = {1, 2, 3};
        System.out.println(myArray2.length);

        // 3. Declare another array called myArray3 with 3 values 0 - 3
        int myArray3[] = {1, 2, 3};
        System.out.println(myArray3.length);

        // 4. Declare another array called myArray4 - an empty array with 4 elements
        int[] myArray4 = new int[4];
        System.out.println(myArray4.length);
        System.out.println(Arrays.toString(myArray4));

        // access the values from myArray4 using a for-loop
        for (int i = 0; i < myArray4.length; i++) {
            System.out.println(myArray4[i]);
        }

        boolean[] myArray4_1 = new boolean[5];
        System.out.println(myArray4_1.length);
        System.out.println(Arrays.toString(myArray4_1));

        // 5. Declare an array called myCharArray[]
        char[] myCharArray = new char[4];
        System.out.println(myCharArray.length);

        // Q: use a for-loop to print out the individual elements' value found in myCharArray
        for (int i = 0; i < myCharArray.length; i++) {
            System.out.println(myCharArray[i]);
        }

        // 6. Declare an array called myArray5 - fill it with a default of 10 across the array
        // Use utility function Arrays.toString to print out the entire array's data
        int myArray5[] = {8, 8, 8, 8};
        System.out.println(Arrays.toString(myArray5));

        // Use utility function Arrays.fill() to replace all values found in myArray5
        Arrays.fill(myArray5, 10);
        System.out.println(Arrays.toString(myArray5));

        // Retrieve and print the value from myArray5 at index 0 (1st element)
        // Retrieve and print the value from myArray5 at index 1 (2nd element)
        // Retrieve and print the value from myArray5 at index 2 (3rd element)
        // Retrieve and print the value from myArray5 at the last index of myArray5 (4th element)
        System.out.println(myArray5[0]);
        System.out.println(myArray5[1]);
        System.out.println(myArray5[2]);
        System.out.println(myArray5[myArray5.length - 1]);

    }

}
