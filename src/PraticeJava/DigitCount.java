package PraticeJava;
import java.util.Scanner;
public class DigitCount {
 public  static int digitFreq(int n,int d) {
	 int count=0;
	 while(n>0) {
		 int dig=n%10;
		 n=n/10;
		 if(dig==d) {
			 count++;
			
		 }
		 
	 }
	 return count;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int d=scn.nextInt();
	  int count=digitFreq(n,d);
		System.out.print(count);

	}

}
