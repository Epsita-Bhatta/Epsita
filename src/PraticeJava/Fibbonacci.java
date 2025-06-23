package PraticeJava;
import java.util.Scanner;
public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int a=0;
int b=1;
for(int i=1;i<=n;i++) {
	System.out.println(a);
	int c=a+b;
	a=b;
	b=c;
}
	}

}
