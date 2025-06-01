import java.util.Scanner;

class TriangleValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle 1 = ");
        int angle1 = sc.nextInt();

        System.out.print("Enter angle 2 = ");
        int angle2 = sc.nextInt();

        System.out.print("Enter angle 3 = ");
        int angle3 = sc.nextInt();

        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && (angle1 + angle2 + angle3) == 180) {
            System.out.print("It is a Triangle");
        } 
    }
}
