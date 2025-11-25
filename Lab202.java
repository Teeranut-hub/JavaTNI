import javax.swing.*;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();
        System.out.println("\n");
        int sum = number1 + number2,sub = number1 - number2;
        double mul = number1 * number2,Modulus = number1 % number2;
        float Division = number1 /Float.parseFloat(number2+"");
        System.out.println("Summation = "+sum+
                "\nSubtraction = "+sub+
                "\nMultiplication = "+mul+
                "\nDivision = "+Division+
                "\nModulus = "+Modulus);
    }
}
