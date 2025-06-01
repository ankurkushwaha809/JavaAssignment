import java.util.Scanner;

public class ECommerceDeliveryCheck {
    public static void main(String[] args) {
        boolean isServiceAvailable = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your delivery pin code: ");
        int deliveryPin = scanner.nextInt();

        if (isServiceAvailable) {
            if (deliveryPin == 560001) {
                System.out.println("Delivery available in your area.");
            } else {
                System.out.println("Delivery not available at this pin code.");
            }
        } else {
            System.out.println("Service currently unavailable.");
        }
    }
}
