package Practicedaily;
import java.util.*;
public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=scn.nextInt();
      }
      int[] span=new int[arr.length];
      
      Stack<Integer> st=new Stack<>();
      st.push(0);
      span[0]=1;
      for(int i=1;i<arr.length;i++) {
    	 
    	  while(st.size()>0 &&arr[i]>=arr[st.peek()]) {
    		  st.pop();
    	  }if(st.size()==0) {
    		  span[i]=i+1;
    		  
    	  }else {
    		  span[i]=i-st.peek();
    	  }
    	  st.push(i);
      }
      for(int i=0;i<span.length;i++) {
    	  System.out.println("The stockspan of" +arr[i]+ "is  " +span[i]);
      }
	}

}
