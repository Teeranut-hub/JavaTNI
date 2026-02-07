import java.util.Scanner;

public class Lab301 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();
        String result = "This number is ";
        if(number % 2 == 0 && number != 0)
        {
            result += "Even and Positive";
        }else if (number % 2 != 0)
        {
            result += "Odd and Negative";
        }else
        {
            result += "Zero";
        }
        System.out.println("This number is "+result+" number.");
    }
}
