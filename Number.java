import java.util.*;

class Number{
        public static void main(String [] args){
                Scanner sc=new Scanner(System.in);
                int a,b;
                System.out.println("Enter the first number ");
                a=sc.nextInt();
                System.out.println("Enter the Second number ");
                b=sc.nextInt();
                System.out.println("The Quotient is "+ a/b +" and Reminder is " + a%b + " of two numbers "+a+ " and "+b);
        }
}
