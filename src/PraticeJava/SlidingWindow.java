package PraticeJava;
import java.util.*;
import java.io.*;
public class SlidingWindow {

	public static void main(String[] args)throws Exception {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int n=Integer.parseInt(br.readLine());
	    int[] a=new int[n];
	    for(int i=0;i<a.length;i++) {
	    	a[i]=Integer.parseInt(br.readLine());
	    }
	    int k=Integer.parseInt(br.readLine());
	    Stack<Integer> st=new Stack<>();
	    int[] nge=new int[a.length];
	    st.push(a.length-1);
	    nge[a.length-1]=a.length;
	    for(int i=a.length-2;i>=0;i--) {
	    	while(st.size()>0 && a[i]>a[st.peek()]) {
	    		st.pop();
	    	}if(st.size()==0) {
	    		nge[i]=a.length;
	    	}else {
	    		nge[i]=st.peek();
	    	}
	    	st.push(i);
	    }
	    int j=0;
	    for(int i=0;i<=a.length-k;i++) { 
	    	if(j<i) {
	    		j=i;
	    	}
	    	while(nge[j]<i+k) {
	    		j=nge[j];
	    	}
	    	System.out.println(a[j]);	
	    }
	}

}
