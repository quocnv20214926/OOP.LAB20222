import java.util.Scanner;
public class ComputeNumbers {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter Num1:");
		String strNum1 = input.nextLine();
		Double num1 =Double.parseDouble(strNum1);
		System.out.print("enter Num2");
		String strNum2 =input.nextLine();
		Double num2 =Double.parseDouble(strNum2);
		Double sum = num1+num2;
		System.out.println("sum of "+num1 +"and"+num2 +"is:"+ sum);
		Double difference =num1-num2;
		System.out.println("difference of"+num1 +"and"+num2 +"is:"+difference);
		Double product = num1*num2;
		System.out.println("product of"+ num1+"and"+num2 +"is:"+product);
		if (num2==0) {
			System.out.println("Erorr");
		}else {
			Double quoitient = num1/num2;
			System.out.println("quoitient of"+num1 +"and"+num2+"is:"+quoitient);
		}
		input.close();
		
		
		
	}
}
