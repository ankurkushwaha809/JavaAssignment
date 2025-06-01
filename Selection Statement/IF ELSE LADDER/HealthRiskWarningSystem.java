import java.util.Scanner;

public class HealthRiskWarningSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        float weight = scanner.nextFloat();

        System.out.print("Enter your height in meters: ");
        float height = scanner.nextFloat();

        float bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        if (bmi >= 25) {
            System.out.println("Warning: You are overweight.");
        } 
        else if (bmi < 18.5) {
            System.out.println("Warning: You are underweight.");
        } else {
            System.out.println("Your BMI is normal.");
        }
    }
}
