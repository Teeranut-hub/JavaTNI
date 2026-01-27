import javax.swing.JOptionPane;

public class TicketInfo {

    // เมธอดเลือกเวลาฉาย [cite: 139]
    public static String select_showtime(Movie movie) {
        String message = movie.toString() + "\n" +
                "Press 1 to select show time = 13:00\n" +
                "Press 2 to select show time = 14:30\n" +
                "Press 3 to select show time = 15:00\n" +
                "Enter a number:";
        String input = JOptionPane.showInputDialog(message);

        if (input == null) return "Error time"; // กรณีปิด Dialog

        switch (input) {
            case "1": return "13:00";
            case "2": return "14:30";
            case "3": return "15:00";
            default: return "Error time";
        }
    }


    public static String select_seat_number() {
        String row = JOptionPane.showInputDialog("Select seat row [A-G]:");
        if (row == null) row = "";

        String number = JOptionPane.showInputDialog("Select seat number [1-12]:");
        if (number == null) number = "";

        return row.toUpperCase() + number;
    }

    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", 120, "PG-13");


        String show_time = select_showtime(movie);


        String seat_number = select_seat_number();


        Ticket ticket = new Ticket("T001", movie, show_time, seat_number, 240.0);


        JOptionPane.showMessageDialog(null, ticket.toString());
    }
}