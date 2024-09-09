package loops;

public class While {

    public static void main(String[] args) {

        // initialize variable init with a value of 5
        int init = 5;

        // using a while loop to print a statement while init is less than 5
        while(init < 5){
            System.out.println("while loop output for init: " + init);
        }

        // using a do while loop to print a statement while init is less than 5
        do {
            System.out.println("do while loop output for init: " + init);
        }while(init < 5);

    }
}
