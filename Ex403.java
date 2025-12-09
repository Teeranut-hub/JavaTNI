import javax.swing.*;

public class Ex403 {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Enter your email:");

        while (email.toLowerCase().endsWith("@gmail.com") == false){
            email = JOptionPane.showInputDialog("Please enter your email, again:");
        }
        JOptionPane.showMessageDialog(null,"Your mail is "+email);
    }
}
