package PraticeJava;
import java.util.Arrays;
public class ReverseArr {
 

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] A= {1,6,7,8,4};
int N=A.length;
int temp;
System.out.println("arrays before "+Arrays.toString(A));
for(int i=0;i<N/2;i++) {
	temp=A[i];
	A[i]=A[N-i-1];
	A[N-i-1]=temp;
}
System.out.println("Arrays  after"+Arrays.toString(A));

	}

}
