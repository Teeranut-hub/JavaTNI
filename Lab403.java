import javax.swing.*;

public class Lab403 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter username:");
        String pass = JOptionPane.showInputDialog("Enter password:");
        if(name.equalsIgnoreCase("admin")&&pass.equals("Admin1234")){
            JOptionPane.showMessageDialog(null,"Login success");

        }else {
            while(true){
                if(name.equalsIgnoreCase("admin")&&pass.equals("Admin1234")){
                    JOptionPane.showMessageDialog(null,"Login success");
                    break;
                }
                JOptionPane.showMessageDialog(null,"Login failed...","Incorrect username or password",JOptionPane.WARNING_MESSAGE);
                name = JOptionPane.showInputDialog("Enter username: ");
                pass = JOptionPane.showInputDialog("Enter password: ");
            }
        }
    }
}
