import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        int min = Integer.parseInt(JOptionPane.showInputDialog("Input minutes: "));
        int Hour = min / 60;
        int total_minute =  min % 60;
        JOptionPane.showMessageDialog(null,min+" minutes is "+Hour
                +" hour "+total_minute+" minute");
    }
}
