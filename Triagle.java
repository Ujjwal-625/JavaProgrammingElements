import java.util.*;

class Triangle{
	public static void main(String [] args){
		float height,base;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height of the triangle");
		height=sc.nextFloat();
		System.out.println("Enter the base of Triangle");
		base=sc.nextFloat();
		double Area=base*height/2;
		System.out.println("Area of the triagle with height " + height+ " and base "+ base +" is "+ Area);
	}
}
