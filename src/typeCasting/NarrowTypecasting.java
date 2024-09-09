package typeCasting;

public class NarrowTypecasting {

    public static void main(String[] args){

        double d = 100.94;  // declare variable d of type double with a value of 100.94

        long l = (long)d;   // explicit typecast to long

        int i = (int)l;     // explicit typecast to int

        // Print d, l and i
        System.out.println("double value: " + d);
        System.out.println("long value: " + l);
        System.out.println("int value: " + i);
    }
}
