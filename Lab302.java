import javax.swing.*;
import java.text.DecimalFormat;

public class Lab302 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("###.0");
        String name = JOptionPane.showInputDialog("Enter your name:");
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height(cm.):"));
        int male = JOptionPane.showConfirmDialog(null,
                "Are your biological gender is Male?","Gender",JOptionPane.YES_NO_OPTION);
        if(male == JOptionPane.YES_OPTION){
            double maleheight = height - 100;
            JOptionPane.showMessageDialog(null,
                    "Hello, Mr."+name+"\nif your height is "+ format.format(height) +" cm.\nYour weight should be "+ maleheight+" kg.");
        }else {
            int female = JOptionPane.showConfirmDialog(null,
                    "Are your biological gender is Female?","Gender",JOptionPane.YES_NO_OPTION);
            if (female == JOptionPane.YES_OPTION){
                double maleheight = height - 110;
                JOptionPane.showMessageDialog(null,
                        "Hello, Ms."+name+"\nif your height is "+ format.format(height) +" cm.\nYour weight should be "+ maleheight+" kg.");
            }else {
                JOptionPane.showMessageDialog(null,
                        "You can use BMI to measure your weight and height.");
            }
        }
    }
}
