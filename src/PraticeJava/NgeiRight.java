package PraticeJava;
import java.util.*;
import java.io.*;
public class NgeiRight {

	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		int nge[]=new int[a.length];
		nge[a.length-1]=-1;
		Stack<Integer> st=new Stack<>();
		st.push(a.length-1);
		for(int i=a.length-2;i>=0;i--) {
			while(st.size()>0 &&a[st.peek()]<a[i]) {
				st.pop();
			}
			if(st.size()==0) {
				nge[i]=-1;
			}else {
				nge[i]=a[st.peek()];
			}
			st.push(i);
		}
		for(int i=0;i<nge.length;i++) {
			System.out.print(" " +nge[i]+" ");
		}
		
	}

}
