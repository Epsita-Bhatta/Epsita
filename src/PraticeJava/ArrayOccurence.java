package PraticeJava;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element you want to check");
		
		int p=sc.nextInt();
int[] A= {3,3,3,3,3,3};
int N=A.length;
int count=0;
boolean flag=false;
Arrays.sort(A);


for(int i=0;i<N;i++) {
		if(A[i]==p) {
			count++;
			flag=true;
		}
		
}
if(flag==false) {
	System.out.println("element not found");
}
else
System.out.println("Entered element has occured "+count+" times");
	}

}
