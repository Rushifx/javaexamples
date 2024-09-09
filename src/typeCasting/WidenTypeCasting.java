package typeCasting;

public class WidenTypeCasting {

    public static void main(String[] args){

        int i = 100;    // declare an integer called i and assign a value of 100

                        // automatic type conversion form integer to long
        long l = i;     // declaring a variable called l and assigned a value of 100 from i

                        // automatic type conversion from long to float
        float f = l;    // declaring a variable called f and assigned a value of 100 from l

        //Print the outputs of i, l and f
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
    }
}
