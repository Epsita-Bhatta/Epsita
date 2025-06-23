package PraticeJava;
import java.util.Scanner;
public class ReverseNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int num=scn.nextInt();
while(num!=0) {
	System.out.println(num%10);
	num=num/10;
}
	}

}
