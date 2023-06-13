
import java.util.Scanner;

public class SolveFirstEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = input.nextDouble();
        if (a==0){
        	System.out.println("equation is not linear :");
        	
        
        }else {
        	double x= -b/a;
        	System.out.println("the solution of equation is :"+x);
        }
        
        
        
        
        input.close();
    }
}