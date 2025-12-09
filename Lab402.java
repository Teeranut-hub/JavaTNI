import javax.swing.JOptionPane;
public class Lab402 {
    public static void main(String[] args) {
        String id;

        while (true) {
            id = JOptionPane.showInputDialog("Enter student id:");

            if (id == null) System.exit(0);

            // ต้องยาว 10 ตัวเท่านั้น ไม่งั้นวนใหม่เงียบ ๆ
            if (id.length() != 10) {
                continue;
            }

            break;
        }

        String major = id.substring(2, 5);

        switch (major) {
            case "131":
                JOptionPane.showMessageDialog(null, "Student ID: "+id+"\nInformation Technology (IT)");
                break;
            case "132":
                JOptionPane.showMessageDialog(null, "Student ID: "+id+"\nMultimedia Technology (MT)");
                break;
            case "133":
                JOptionPane.showMessageDialog(null, "Student ID: "+id+"\nDigital Business Information Technology (BI)");
                break;
            case "134":
                JOptionPane.showMessageDialog(null, "Student ID: "+id+"\nDigital Technology in Mass Communication (DC)");
                break;
            case "135":
                JOptionPane.showMessageDialog(null, "Student ID: "+id+"\nData Science and Data Analytics (DS)");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Student ID: "+id+"\nCannot found major");
        }
    }
}
