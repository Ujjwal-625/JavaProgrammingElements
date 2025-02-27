import java.util.*;

class Height{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your height in centimeter ");
		int cm=sc.nextInt();
		int inches=(int)(cm*0.3937007874015748);
		int feets=inches/12;
		int inch=inches%12;
		System.out.println("Your Height in cm is "+ cm +" cm while in feet is " +feets+" feet and "+ inch + " inches ");
		}
	}
