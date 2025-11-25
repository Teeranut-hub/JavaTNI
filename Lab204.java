import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input hour: ");
        int hour = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Input minute: ");
        int minute = scanner.nextInt();


        int Hour = hour*60;
        int  Total_time = Hour+minute;
        System.out.println("Total time is "+Total_time+" minutes");
    }
}
