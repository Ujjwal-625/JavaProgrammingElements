import java.util.*;

class DoubleOperations{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                double a,b,c;
                System.out.println("Enter a");
                a=sc.nextDouble();
                System.out.println("Enter b");
                b=sc.nextDouble();
                System.out.println("Enter c");
                c=sc.nextDouble();

                double op1=a+b*c;
                double op2=a*b+c;
                double op3=c+a/b;
                double op4=a%b+c;
                System.out.println("a + b *c = "+ op1+"\na * b + c = "+op2+"\nc + a / b = "+op3+"\na % b + c = "+op4);
        }
}
