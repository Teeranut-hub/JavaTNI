import java.util.Scanner;

public class Lab303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for X coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter the value for Y coordinate: ");
        int y = scanner.nextInt();
        
        String position = "";
        if(x == 0 && y == 0){
            position = "Origin";
        } else if (x > 0 && y > 0) {
            position = "First quadrant";
        } else if (x < 0 && y > 0) {
            position = "Second quadrant";
        } else if (x < 0 && y < 0) {
            position = "Third quadrant";
        } else if (x > 0 && y < 0) {
            position = "Fourth quadrant";
        }
        System.out.println("The coordinnate point (" + x + "," + y +") lises in the "+ position);
    }
}
