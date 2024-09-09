package loops;

public class BreakAndContinue {

    public static void main(String[] args) {

        // Use break keyword to disrupt a for loop
        for (int i = 0; i < 10; i++) {
            if(i == 3)
                break;
            System.out.println(i);
        }

        // Use break keyword to disrupt a while loop
        int count = 0;
        while(count < 10){
            if(count == 3)
                break;
            System.out.println(count);
            count++;
        }

        // Use continue keyword to skip an iteration
        for (int i = 0; i < 10; i++) {
            if(i == 3){
                System.out.println("skipped value: " + i);
                continue;
            }
            System.out.println("num: " + i);
        }

        // Create a while loop that prints a value from variable j to count to 10
        int j = 1;

        while(j <= 10){
            // within the while loop, skip printing the value of j if j == 3
            if(j == 3) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }

    }

}
