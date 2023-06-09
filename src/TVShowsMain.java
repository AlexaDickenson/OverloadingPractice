import java.util.ArrayList;
import java.util.Scanner;
public class TVShowsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TVShows> enterTVShows = new ArrayList<>();

        while (true) {
            System.out.println("Name of the show: ");
            String showName = scanner.nextLine();

            if (showName.isEmpty()) {
                break;
            }

            System.out.println("How many episodes? ");

            int numberOfEpisodes = Integer.valueOf(scanner.nextLine());
            System.out.println("What is the genre? ");
            String genre = scanner.nextLine();

            enterTVshows.add(new TVShows(showName, numberOfEpisodes, genre));


            for (TVShows omg : enterTVshows) {
                System.out.println(omg);

            }
        }
    }
}