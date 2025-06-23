package Epsita;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
int[][] a=new int[2][3];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array element:");
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++) {
		a[i][j]=sc.nextInt();
	}
	
}
for(int arr[]:a) {
	for(int x:arr) {
		System.out.print(x+" ");
	}System.out.println();
	
}
sc.close();
		}

}
