package PraticeJava;
import java.util.Arrays;
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] A= {1,8,6,2,9};
int N=A.length;
int temp=0;
System.out.println("Before"+Arrays.toString(A));
for(int i=0;i<N;i++) {
	for(int j=i+1;j<N;j++) {
		if(A[i]>A[j]) {
			temp=A[i];
			A[i]=A[j];
			A[j]=temp;
		}
	}
}
System.out.println("after"+Arrays.toString(A));
	}

}
