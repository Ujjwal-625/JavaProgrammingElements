class Fees{
	public static void main(String [] args){
	int fee=125000,discount=10;
	int discountAmount=fee*discount/100;
	int paybleFee=fee-discountAmount;
	System.out.println("The discount amount is "+discountAmount+ " INR and final discounted fee is "+ paybleFee + " INR");
	}
}
