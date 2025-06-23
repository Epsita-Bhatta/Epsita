package PraticeJava;

import java.util.Arrays;

public class NegativeArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] A= {1,3,5,-7,-4,8,-1,8,-3};
int N=A.length;
int temp; 
for(int i=0;i<N;i++) {
	for(int j=i+1;j<N;j++) {
		if(A[i]>0 &&A[j]<0) {
			temp=A[i];
			A[i]=A[j];
			A[j]=temp;
			
		}
		else {
			continue;
		}
	 
}
System.out.println(Arrays.toString(A));
	}

}
