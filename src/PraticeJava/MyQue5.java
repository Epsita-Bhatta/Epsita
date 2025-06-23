package PraticeJava;
import java.util.Scanner;
public class MyQue5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
int t=scn.nextInt();
int a[]=new int [t];
for(int i=0;i<t;i++) {
	 a[i]=scn.nextInt();
}
boolean flag=true;
for(int i=0;i<a.length;i++) {
	for(int j=2;j<=Math.sqrt(a[i]);j++) {
		if(a[i]%j==0) {
			flag=false;
			break;
		}
	}
	if(flag==true) {
		System.out.println("prime");
	}else {
		System.out.println("Not prime");
	}
}
	}

}
