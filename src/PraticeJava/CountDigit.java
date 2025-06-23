package PraticeJava;
import java.util.Scanner;
public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int dig=0;

while(n!=0) {
	n=n/10;
	dig++;
}
System.out.println(dig);
	}

}
