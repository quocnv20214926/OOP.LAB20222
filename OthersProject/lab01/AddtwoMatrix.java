import java.util.Scanner;
public class AddtwoMatrix {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int rows  ,colums;

		System.out.print("enter the number of row: ");
		rows = input.nextInt();
		System.out.print("enter the number of colums: ");
		colums = input.nextInt();

		int[][] matrix1 = new int[rows][colums];
		int[][] matrix2 = new int[rows][colums];
		int[][] sMatrix = new int[rows][colums];
		System.out.println("enter elements of matrix1: ");
		for (int i=0;i<rows ;i++) {
			for(int j=0;j<colums;j++) {
				matrix1[i][j] =input.nextInt();
				
			}
		}
		System.out.println("enter elements of matrix2: ");
		for (int i=0;i<rows ;i++) {
			for(int j=0;j<colums;j++) {
				matrix2[i][j] =input.nextInt();
				
			}
		}
		for (int i=0;i<rows;i++) {
			for (int j=0;j<colums;j++) {
				sMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("the sum of two matrix is: ");
		for (int i=0;i<rows ;i++) {
			for(int j=0;j<colums;j++) {
				System.out.print(sMatrix[i][j]+" ");
				
				
			}
		System.out.println();
		input.close();
		}
	}

}

