import java.util.Scanner;

public class Ex402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first message: ");
        String msg1 = scanner.nextLine();
        System.out.print("Enter the second message: ");
        String msg2 = scanner.nextLine();

        System.out.println();

        System.out.print("Sensitive comparison  :");
        if(msg1.equals(msg2)){
            System.out.println(" Both message are the same");
        }else {
            System.out.println(" Both message are NOT the same");
        }

        System.out.print("Insensitive Comparison :");
        if(msg1.equalsIgnoreCase(msg2)){
            System.out.println(" Both message are the same");
        }else {
            System.out.println(" Both message are NOT the same");
        }
    }
}
