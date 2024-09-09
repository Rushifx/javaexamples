package switchstatements;

public class Switch3 {

    public static void main(String[] args) {

        int discount = 5;
        int purchases = 5;

        switch (discount){
            case 20:
                if(purchases > 5)
                    System.out.println("25% discount");
                else
                    System.out.println("20% discount");
                break;
            case 30:
                if(purchases > 5)
                    System.out.println("35% discount");
                else
                    System.out.println("30% discount");
                break;
            default:
                System.out.println("Standard discount at 10%");
                break;
        }
    }
}
