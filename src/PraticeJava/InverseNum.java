package PraticeJava;
import java.util.*;
public class InverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int op=1;
		int inv=0;
		while(num!=0) {
			int od=num%10;
			int id=op;
			int ip=od;
			
			inv=inv+id*(int)Math.pow(10, ip-1);
			num=num/10;
			op++;
		}
System.out.println(inv);
	}

}
