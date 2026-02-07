import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // --- Task 1: Get Input ---
        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();

        // --- Task 2: Print all numbers in sequence ---
        // ใช้ for loop เพื่อวนลูปตั้งแต่ 'start' ถึง 'end'
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Add a newline after the sequence

        // --- Task 3: Print only even numbers in sequence ---
        System.out.println("\n--- Printing only even numbers ---");

        // Re-prompt for clarity (as shown in the second example output)
        System.out.print("Enter the first number: ");
        // Assuming the input is the same as the first run,
        // but re-reading the input as required by the output structure.
        start = scanner.nextInt();

        System.out.print("Enter the second number: ");
        end = scanner.nextInt();

        // ใช้ for loop เพื่อวนลูปตั้งแต่ 'start' ถึง 'end'
        for (int i = start; i <= end; i++) {
            // Check if the current number is even
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Close the scanner
        scanner.close();
    }
}
