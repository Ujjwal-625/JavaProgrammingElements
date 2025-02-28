import java.util.*;

class IntOperations{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a");
		a=sc.nextInt();
		System.out.println("Enter b");
		b=sc.nextInt();
		System.out.println("Enter c");
		c=sc.nextInt();
		
		int op1=a+b*c;
		int op2=a*b+c;
		int op3=c+a/b;
		int op4=a%b+c;
		System.out.println("a + b *c = "+ op1+"\na * b + c = "+op2+"\nc + a / b = "+op3+"\na % b + c = "+op4);
	}
}
