package Epsita;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		int[] arr= {};
		System.out.println("The length of the arr is:"+arr.length);
		Scanner sc=new Scanner(System.in);
		for (int i=0;i< arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int x:arr) {
			System.out.println(x);
		}
sc.close();
	}

}
