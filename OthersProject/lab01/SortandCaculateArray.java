import java.util.Arrays;
import java.util.Scanner;


public class SortAndCaculateArray {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);

		int[] arr;
		int size;

		System.out.print("enter the size of the array:");
		size =input.nextInt(); 
		arr= new int[size];
		for (int i=0; i<size; i++) {
			System.out.print("enter element "+ (i+1)+":");
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		int sum =0;
		for (int i=0; i<size;i++) {
			sum +=arr[i];	
		}
		double average =(double)sum/size;
		System.out.println("the sorted array is: "+Arrays.toString(arr));
		System.out.println("the sum of array elements is: " +sum);
		System.out.println("the average value of array elements is: "+average);

		input.close();
		}
	
}
