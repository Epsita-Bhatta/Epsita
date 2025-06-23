package Epsita;
import java.util.Scanner;

public class ArrExample {
	

	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data you want :");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
					}
		System.out.println("You Entered");
		for (int x:a) {
			
			System.out.println(x);
			
		}
		sc.close();

	}

}
