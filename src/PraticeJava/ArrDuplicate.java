package PraticeJava;
import java.util.Scanner;

public class ArrDuplicate {

	public static void main(String[] args) {
   int[] a= {1,2,3,4,5,6,3,3,2};
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter the number you want to check :");
   int n=sc.nextInt();
   int count=0;
for(int i=0;i<a.length;i++) {
	if(a[i]==n) {
		count++;
		
	}
}if(count>1) {
System.out.println("The number has repeated for "+count+" no. of times");
}
else
	System.out.println("The number has not repeated itself.");

sc.close();
	}

}
