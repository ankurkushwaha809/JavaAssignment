import java.util.Scanner;

public class VoterEligibilityWithIdCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
            sc.nextLine(); // consume newline

        System.out.print("Do you have a Voter ID? (Yes/No): ");
        String hasVoterID = sc.nextLine();

        if (age >= 18) {
            if (hasVoterID.equalsIgnoreCase("Yes")) {
                System.out.println("Eligible to vote.");
            } else {
                System.out.println("Not eligible — No Voter ID.");
            }
        } else {
            System.out.println("Not eligible — Underage.");
        }
    }
}