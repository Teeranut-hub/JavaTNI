import java.util.Scanner;

public class Lab602 {
        public static void main(String[] args) {

            String[] movies = {"Me Before You", "Titanic", "Before Sunrise", "The Holiday", "A Walk to Remember"};

            double[] rate_scores = {4.2, 4.9, 4.4, 3.7, 4.3};

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a movie title: ");
            String title = sc.nextLine();

            int foundIndex = -1;

            for (int i = 0; i < movies.length; i++) {
                if (movies[i].equalsIgnoreCase(title)) {
                    foundIndex = i;
                    break;
                }
            }

            sc.nextLine();

            if (foundIndex != -1) {
                System.out.println("The rating score of \"" + movies[foundIndex] + "\" is " + rate_scores[foundIndex]);

                int rank = find_rank(rate_scores, rate_scores[foundIndex]);
                System.out.println(movies[foundIndex] + " is ranked number " + rank + " in popularity.");
            } else {
                System.out.println("Cannot found this movie title...");
            }

            sc.close();
        }

        public static int find_rank(double[] scores, double targetScore) {
            int rank = 1;
            for (double s : scores) {
                if (s > targetScore) {
                    rank++;
                }
            }
            return rank;
        }
}
