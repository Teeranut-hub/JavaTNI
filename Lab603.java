import java.util.Random;
import java.util.Scanner;

public class Lab603 {
    public static void main(String[] args) {
        int[] numbers = random_array();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your guess (0-20): ");
        int guess = sc.nextInt();
        
        int count = count_element(numbers, guess);

        if (count > 0) {
            System.out.println("Congratulations!! " + guess + " is an element in the array!!");
            if (count > 1) {
                System.out.println("Fantastic!! It also appears more than once!!");
            }
        } else {
            System.out.println("Sorry, try again next time...");
            display_array(numbers); // Reveal numbers if incorrect
        }
    }

    public static int[] random_array() {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(21);
        }
        return arr;
    }

    public static void display_array(int[] numbers) {
        System.out.print("Here are the elements in the array: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();
    }

    public static int count_element(int[] numbers, int element) {
        int count = 0;
        for (int n : numbers) {
            if (n == element) count++;
        }
        return count;
    }
}
