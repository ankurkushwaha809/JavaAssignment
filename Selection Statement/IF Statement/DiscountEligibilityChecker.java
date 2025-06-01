import java.util.Scanner;
class DiscountEligibilityChecker{
    public static void main(String[] args){
Scanner sc= new Scanner(System.in);

System.out.print("Enter the total amount of your purchase : ");
 float totalAmount= sc.nextFloat();
 if(totalAmount>=500){
float discount = totalAmount * 0.10f;  // 10% of totalAmount
 float discountedAmount = totalAmount - discount; 
System.out.println("Shopping Amount           :   "+totalAmount);
System.out.println("Eligible for 10% discount :   " +discount);
System.out.println("-------------------------------------------------");
System.out.println("Total amount after Discount  : " + discountedAmount);

 }
    }
}