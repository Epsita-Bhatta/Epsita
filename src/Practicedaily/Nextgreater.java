package Practicedaily;
import java.util.*;
public class Nextgreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int[] a=new int[n];
      for(int i=0;i<a.length;i++) {
    	  a[i]=scn.nextInt();
      }
      int[] nge=new int[a.length];
      Stack<Integer> st=new Stack<>();
      st.push(a[a.length-1]);
      nge[a.length-1]=-1;
      for(int i=a.length-2;i>=0;i--) {
    	  while(st.size()>0 && a[i]>=st.peek()) {
    		  st.pop();
    	  }
    	  if(st.size()==0) {
    		  nge[i]=-1;
    	  }else {
    		  nge[i]=st.peek();
    	  }
    	  st.push(a[i]);
      }
      for(int i=0;i<nge.length;i++) {
    	  System.out.println("the next greater element of"+a[i]+"is"+nge[i]);
      }


	}

}
