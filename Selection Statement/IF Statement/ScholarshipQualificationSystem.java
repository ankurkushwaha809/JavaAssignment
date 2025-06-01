import java.util.Scanner;

class MainLogic{
Scanner sc = new Scanner(System.in);

public MainLogic(){
    System.out.print("Enter student percentage scholarship : ");
    float studentPercentage = sc.nextFloat();
    System.out.print("Enter student family income scholarship : ");
    int studentIncome = sc.nextInt();
            sc.nextLine(); // consume newline

    System.out.print("Enter student cast(OBC/General/SC/ST) : ");
        String studentCaste = sc.nextLine();
// equalsIgnoreCase("General"))   <-----------------when case not matter
        if (studentPercentage >= 60 && studentIncome <= 300000 && !studentCaste.equalsIgnoreCase("General")) {
            System.out.println("Student Eligible for scholarship.");
    }
}
}
class ScholarshipQualificationSystem{
public static void main(String arg[]){
MainLogic m1 = new MainLogic();

}
}