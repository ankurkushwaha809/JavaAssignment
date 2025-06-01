import java.util.Scanner;

public class MovieRatingChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie rating (1 to 5): ");
        int rating = sc.nextInt();

        if (rating == 5) {
            System.out.println("Excellent movie!");
        } else if (rating == 4) {
            System.out.println("Very good movie.");
        } else if (rating == 3) {
            System.out.println("Good movie.");
        } else if (rating == 2) {
            System.out.println("Average movie.");
        } else if (rating == 1) {
            System.out.println("Poor movie.");
        } else {
            System.out.println("Invalid rating, Please enter a value between 1 and 5.");
        }

    }
}