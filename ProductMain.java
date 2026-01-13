import javax.swing.*;

public class ProductMain {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Wellcome to Product Stock System");
        Product product = new Product();
        product.name = JOptionPane.showInputDialog("Enter product name:");
        product.price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item:"));
        product.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter product stock:"));
        System.out.println();
        product.showInfo();
        System.out.println();
        int addStockConfirm = JOptionPane.showConfirmDialog(null,
                "Do you want to add more item" + JOptionPane.YES_NO_CANCEL_OPTION);
        if(addStockConfirm == JOptionPane.YES_OPTION){
            int amount = Integer.parseInt(JOptionPane.showInputDialog("How many item to add in stock:"));
            product.addStock(amount);
        }
        int changePriceConfirm = JOptionPane.showConfirmDialog(null,
                "Do you want to change price?" + JOptionPane.YES_NO_CANCEL_OPTION);
        if(changePriceConfirm == JOptionPane.YES_OPTION){
            double newPrice = Double.parseDouble(JOptionPane.showInputDialog("How much is new price per item ?:"));
            product.changePrice(newPrice);
        }
        System.out.println();
        product.showInfo();
        System.out.println();
    }
}
