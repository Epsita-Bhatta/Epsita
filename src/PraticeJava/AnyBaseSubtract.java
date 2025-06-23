package PraticeJava;
import java.util.*;
public class AnyBaseSubtract {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int b=scn.nextInt();
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int fv=getSubs(b,n1,n2);
		System.out.println(fv);
		

	}
	public static int getSubs(int b,int n1,int n2) {
		int rv=0;
		int p=1;
		while(n2>0) {
			int d1=n1%10;
			int d2=n2%10;
			n1=n1/10;
			n2=n2/10;
			if(d1<d2) {
				d1+=b;
				n1-=1;
			}
			int d=d1-d2;
			rv+=d*p;
			p=p*10;
		}
		
		
		return rv;
	}

}
