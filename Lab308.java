import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  max = 0,min = 0,even = 0,odd = 0;
        System.out.print("How many number to input: ");
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++){
            System.out.print("Enter number "+ i +": ");
            int number = scanner.nextInt();
            if (number > max){
                max = number;
            }
            if (i==1) min=max;
            if (number < min){
                min = number;
            }
            if (number % 2 ==0){
                even++;
            }
            if (number % 2 != 0){
                odd++;
            }
        }
        System.out.println("Maximum = "+ max +"\nMinimum = "+ min +"\nEven number = "+ even +"\nOdd number = "+ odd);
    }
}
