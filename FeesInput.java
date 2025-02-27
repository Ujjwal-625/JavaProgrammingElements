import java.util.*;

class Fees{
        public static void main(String [] args){
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the fee amount ");
        int fee=sc.nextInt();
	System.out.println("Enter the dicount percentage");
	float discount=sc.nextFloat();
        double discountAmount=fee*discount/100;
        double paybleFee=fee-discountAmount;
        System.out.println("The discount amount is "+discountAmount+ " INR and final discounted fee is "+ paybleFee + " INR");
        }
}
