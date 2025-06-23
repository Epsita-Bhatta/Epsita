package PraticeJava;
import java.util.Arrays;
public class ReverseArray {

	public static void main(String[] args) {
int [] n= {1,2,3,5,7,8};
System.out.println("Before :"+Arrays.toString(n));
for(int i=n.length-1;i>=0;i--) {
	System.out.println((n[i]));
}
	}

}
