import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;

        Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        System.out.println("Welcome to Mini Shop");
        System.out.println("Press [1] to buy Pen");
        System.out.println("Press [2] to buy Notebook");

        int number = 0;

        while (true) {
            System.out.print("Enter a number: ");
            number = scan.nextInt();

            if (number == 1 || number == 2) {
                break;
            } else {
                System.out.print("Invalid number! ");
            }
        }


        Product selectedProduct = (number == 1) ? product1 : product2;

        selectedProduct.showInfo();

        System.out.println("-----------------------------------");

        System.out.print("How many " + selectedProduct.name + " do you want to buy? ");
        int amount = scan.nextInt();

        selectedProduct.sell(amount);
        selectedProduct.showInfo();
    }
}