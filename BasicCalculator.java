import java.util.*;

class BasicCalculator{
        public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        float a,b;
        System.out.println("Enter the first number");
        a=sc.nextFloat();
        System.out.println("Enter the second number");
        b=sc.nextFloat();

        float addition=a+b;
        float subtraction=a-b;
        float multiplication=a*b;
        float division=a/b;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+ a + " and "+b+" is " + addition + " , " +subtraction + " , " + multiplication+" and "+ division);
        }
}
