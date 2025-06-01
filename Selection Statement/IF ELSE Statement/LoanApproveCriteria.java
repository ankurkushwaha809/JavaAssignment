import java.util.Scanner;

public class LoanApproveCriteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your monthly income: ");
        double income = sc.nextDouble();

        System.out.print("Enter your credit score: ");
        int creditScore = sc.nextInt();

        if (age >= 21 && age < 60 && income >= 25000 && creditScore >= 700) {
            System.out.println("Congratulations! Your loan is approved.");
        } else {
            System.out.println("Sorry, your loan application is not approved.");
        }

    }
}