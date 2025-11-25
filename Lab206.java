import javax.swing.*;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {
        final int buffeprice = 299;

        DecimalFormat frm = new DecimalFormat("###.00");

        int customer = Integer.parseInt(JOptionPane.showInputDialog("How many customer?"));
        int Total = buffeprice * customer;
        double net_total = Total*7.00/100 + Total; //959.79
        double Price_with_net = Double.parseDouble(JOptionPane.showInputDialog("Price with NET is "+frm.format(net_total)+" baht." +
                "\nHowmuch of discount (%) onyour coupon?"));

        DecimalFormat format = new DecimalFormat("##.00");
        double pay = Total - (Total*Price_with_net)/100; //863.81
        int Total_price = Integer.parseInt(JOptionPane.showInputDialog("Total price is "+frm.format(pay)+" baht." +
                "\nEnter the amount the customer paid:"));
        double change = Total_price - pay;//36.19
        JOptionPane.showMessageDialog(null,"Total price is "+frm.format(pay)+" baht."+
                "\nCustomer paid "+Total_price+" baht."+
                "\nGet change "+format.format(change)+" baht.");
    }
}
