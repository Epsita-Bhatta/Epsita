package PraticeJava;
import java.util.Scanner;
public class CountDig2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int dig=0;
int temp=n;
while(temp!=0) {
	temp=temp/10;
	dig++;
	}
int div=(int)Math.pow(10,dig-1);
while(n!=0) {
	int q=n/div;
	System.out.println(q);
	n=n%div;
	div=div/10;
}

	}
}
