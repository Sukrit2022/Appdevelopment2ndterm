import models.orders;
import models.tshirts;

public class Main {
    public static void main(String[] args) {
        // dherai ota tshirt object banauney
        tshirts gorkhaliBatman = new tshirts("Gorkhali Batman", 572, 1235, "Karuna",
                "You either die a hero or live long enough to see yourself be a villain", new String[]{"XL", "Medium", "Large"});
        tshirts buddhaXScott = new tshirts("Travis Scott X Buddha tshirt", 681, 1780, "COllabnpl",
                "Show your pride with the rapper Scott and peace promoter Buddha of Nepal", new String[]{"Small", "Medium", "Large"});

        //  tshirt ko info dekhauney
        System.out.println("T-Shirt Information:");
        gorkhaliBatman.describeTShirt();
        buddhaXScott.describeTShirt();

        // dherai ota object order banauney
        orders order1 = new orders("Gopal Sharma", "0486756465", new String[]{"572", "681"}, new double[]{1235, 1780});
        orders order2 = new orders("Chabi Prasad ", "9880191910", new String[]{"572", "681"}, new double[]{1235, 1780});
        orders order3 = new orders("Ubey Bishwokarma", "9744456601", new String[]{"681"}, new double[]{1780});

        // bill print hanney
        System.out.println("Order 1:");
        order1.printBill();

        System.out.println("Order 2:");
        order2.printBill();

        System.out.println("Order 3:");
        order3.printBill();
    }
}