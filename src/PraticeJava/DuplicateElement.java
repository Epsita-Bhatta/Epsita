package PraticeJava;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] A= {1,5,8,2,5};
int N=A.length;
for(int i=0;i<N;i++) {
	for(int j=i+1;j<N;j++) {
		if(A[i]==A[j]) {
			System.out.println("duplicate element Found at position "+A[j]);
		}
	}
}
	}

}
