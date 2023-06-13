import java.util.Scanner;
public class DisplayTriangle {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" enter heihgts n:");
		int n = input.nextInt();
		int numStars =1;
		for (int i=0; i<n;i++) {
			for (int j =0; j< n-i-1; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<numStars;j++) {
				System.out.print("*");
			}
			numStars +=2;
			System.out.println();
			
		}
		input.close();
		
		
		
		
	}

}
