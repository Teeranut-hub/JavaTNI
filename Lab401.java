import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
        /*String name = JOptionPane.showInputDialog("Enter your full name:");
        if(name != null){
            name.charAt(0)
        }
        JOptionPane.showInputDialog(null,"Wellcome, "+name);*/
        while (true) {
            String input = JOptionPane.showInputDialog("Enter your full name:");

            if (input == null) System.exit(0);

            input = input.trim();

            String[] parts = input.split(" ");

            if (parts.length != 2 || parts[0].isEmpty() || parts[1].isEmpty()) {
                continue;
            }

            String firstName =
                    parts[0].substring(0, 1).toUpperCase() +
                            parts[0].substring(1).toLowerCase();

            String lastName = parts[1].toUpperCase();

            JOptionPane.showMessageDialog(null, "Welcome, "+firstName + " " + lastName);
            break;
        }
    }
}
