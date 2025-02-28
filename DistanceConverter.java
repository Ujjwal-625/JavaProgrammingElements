import java.util.*;

class DistanceConverter{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance in feet");
		double feet=sc.nextDouble();
		double yard=feet/3;
		double miles=yard/1760;
		System.out.println("The distance in yards is "+ yard + " while the distance in miles is "+ miles);			
	}
}
