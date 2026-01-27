import javax.swing.JOptionPane;

public class TicketUsed {


    public static String show_movie_list(Ticket... tickets) {
        String list = "";
        for (Ticket t : tickets) {
            list += t.getTicket_id() + ": " + t.getMovie().toString() + "\n";
        }
        return list;
    }

    public static void main(String[] args) {

        Ticket[] tickets = new Ticket[] {
                new Ticket("T001", new Movie("Titanic", 120, "PG-13"), "12:00", "B7", 280),
                new Ticket("T002", new Movie("Pokemon", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };

        while (true) {

            int choice = JOptionPane.showConfirmDialog(null,
                    "Do you want to book or use a ticket?",
                    "Ticket",
                    JOptionPane.YES_NO_OPTION);


            if (choice != JOptionPane.YES_OPTION) {
                break;
            }


            String movieList = show_movie_list(tickets);
            String inputId = JOptionPane.showInputDialog(movieList + "\nEnter a ticket id for booking:");

            if (inputId != null) {

                boolean found = false;
                for (Ticket ticket : tickets) {
                    if (ticket.getTicket_id().equalsIgnoreCase(inputId)) {
                        found = true;


                        String menuMsg = ticket.getTicket_id() + ": " + ticket.getMovie().toString() + "\n\n" +
                                "Press 1 to book a ticket\n" +
                                "Press 2 to use a ticket\n" +
                                "Press 3 to see a ticket status\n\n" +
                                "Enter a menu:";
                        String menu = JOptionPane.showInputDialog(menuMsg);

                        if (menu != null) {
                            switch (menu) {
                                case "1":
                                    JOptionPane.showMessageDialog(null, ticket.bookTicket());
                                    JOptionPane.showMessageDialog(null, ticket.toString());
                                    break;
                                case "2":
                                    JOptionPane.showMessageDialog(null, ticket.useTicket());
                                    JOptionPane.showMessageDialog(null, ticket.toString());
                                    break;
                                case "3":
                                    JOptionPane.showMessageDialog(null, ticket.toString());
                                    break;
                            }
                        }
                        break;
                    }
                }

                if (!found) {
                    JOptionPane.showMessageDialog(null, "Ticket ID not found.");
                }
            }


            int continueChoice = JOptionPane.showConfirmDialog(null,
                    "Do you want to book or use other tickets?",
                    "Ticket",
                    JOptionPane.YES_NO_OPTION);

            if (continueChoice == JOptionPane.NO_OPTION) {
                break;
            }
        }
    }
}