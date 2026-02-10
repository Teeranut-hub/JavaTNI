package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int espressoCount = 0;
        int frappuccinoCount = 0;
        double totalPrice = 0;

        while (true) {
            System.out.println("Press 1 for ordering Espresso");
            System.out.println("Press 2 for ordering Frappuccino");
            System.out.print("Enter an option: ");
            int option = sc.nextInt();

            if (option == 1) {
                System.out.print("Enter a size: ");
                String size = sc.next();

                Espresso e = new Espresso(size) {
                    @Override
                    public void addShot(int shot) {
                        super.addShot(shot);
                    }
                };

                System.out.print("Press 'y' or 'Y' for adding a shot: ");
                String add = sc.next();
                if (add.equalsIgnoreCase("y")) {
                    System.out.print("How many shots for adding in Espresso: ");
                    int shot = sc.nextInt();
                    e.addShot(shot);
                }

                System.out.println(e);
                espressoCount++;
                totalPrice += e.calculateFinalPrice();
            }
            else if (option == 2) {
                System.out.print("Enter a size: ");
                String size = sc.next();

                System.out.print("Do you would like to add whipped cream [y/Y]? ");
                String add = sc.next();
                boolean whipped = add.equalsIgnoreCase("y");

                Frappuccino f = new Frappuccino(size, whipped);

                System.out.println(f);
                frappuccinoCount++;
                totalPrice += f.calculateFinalPrice();
            }
            else {
                break;
            }

            System.out.print("\nDo you want to order more [y/Y]? ");
            String more = sc.next();
            if (!more.equalsIgnoreCase("y")) break;
        }
        System.out.println();
        System.out.println("\nYou ordered " + espressoCount + " Espresso");
        System.out.println("You ordered " + frappuccinoCount + " Frappuccino");
        System.out.println("Total Price = " + totalPrice);
    }
}