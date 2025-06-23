package PraticeJava;
import java.util.Arrays;
public class FindMaxarr {

	public static  int setmini (int[]A,int N) {
		int mini=Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			if(A[i]<mini) {
				mini=A[i];
			}
			
		}
		return mini;
	}
	public static int setMaxi(int[]A,int N) {
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<N;i++) {
			if(A[i]>maxi) {
				maxi=A[i];
			}
		}
		return maxi;
	}
	public static void main(String[] args) {
		
int[] A= {1,2,3,4,5};
int N=A.length;
System.out.println("The minimum value is "+setmini(A,N));
System.out.println("The maximum value is "+setMaxi(A,N));

	}

}
