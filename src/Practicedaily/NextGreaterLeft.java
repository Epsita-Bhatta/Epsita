package Practicedaily;
import java.util.*;
public class NextGreaterLeft {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int[] nge=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		st.push(arr[0]);
		nge[0]=-1;
for(int i=1;i<arr.length;i++) {
	while(st.size()>0 && arr[i]>=st.peek()) {
		st.pop();
	}
	if(st.size()==0) {
		nge[i]=-1;
	}else {
		nge[i]=st.peek();
	}st.push(arr[i]);
}
for(int i=0;i<nge.length;i++) {
	System.out.println("The next Greater element to the left of "+arr[i]+"is"+nge[i]);
}
	}

}
