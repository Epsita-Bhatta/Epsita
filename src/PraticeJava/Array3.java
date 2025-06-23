package PraticeJava;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		int[]  arr= {100,200,300,400,500};
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		System.out.println("Enter the number you want to search :");
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("The number found at "+i+" th position");
				flag=true;
				break;
			}
		}if(flag==false) {
			System.out.println("The element not found");
		}
			
		
		sc.close();

	}

}
