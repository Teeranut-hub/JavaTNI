import java.util.Scanner;

public class ProductMain4 {
    public static void setting_product(Product... products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product[] products = new Product[4];
        setting_product(products);

        System.out.println("Welcome to MINI SHOP!!");
        System.out.println("----------------------------------------");

        for (int i = 0; i < products.length; i++) {
            System.out.println("Press " + (i + 1) + " to buy " + products[i].name +
                    " (items=" + products[i].quantity + ")");
        }
        System.out.println("----------------------------------------");

        int index = -1;

        while (true) {
            System.out.print("Enter a number: ");
            int input = scan.nextInt();
            if (input >= 1 && input <= 4) {
                index = input - 1;
                break;
            }
            System.out.print("Invalid!! ");
        }

        Product selected = products[index];

        System.out.print("How many " + selected.name + " do you want to buy? ");
        int amount = scan.nextInt();

        selected.sell(amount);

        System.out.println("----------------------------------------");
        selected.showInfo();
    }
}