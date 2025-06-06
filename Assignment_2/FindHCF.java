import java.util.Scanner;

public class FindHCF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // HCF logic using Euclidean algorithm
        if (num2 == 0) {
            System.out.println("HCF: " + num1);
        } else {
            int rem;
            while (num2 != 0) {
                rem = num1 % num2;
                num1 = num2;
                num2 = rem;
            }
            System.out.println("HCF: " + num1);
        }

        sc.close();
    }
    
}

