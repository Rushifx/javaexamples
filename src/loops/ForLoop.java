package loops;

public class ForLoop {

    public static void main(String[] args) {

        // create a simple count up 1 to 10
        int countUp = 10;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if(i == 10)
                System.out.println("Happy May Day!");
        }

        // create a simple count down 10 to 1
        for (int i = countUp; i >= 1; i--) {
            System.out.println(i);

            if(i == 1)
                System.out.println("Happy Labour Day");
        }
    }
}
