import java.util.*;

class PriceFinder{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		float price;
		int quantity;
		System.out.println("Enter the Price of the item ");
		price=sc.nextFloat();
		System.out.println("Enter the quantity of the item ");
		quantity=sc.nextInt();
		double TotalPrice=price*quantity;
		System.out.println("The total purchase price is " +TotalPrice +"INR if the quantity is " + quantity + " and unit price is "+ price +" INR");
	}
} 
