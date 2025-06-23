package Practicedaily;
import java.util.*;
public class HistogramArea {

	public static void main(String[] args) {
	  Scanner scn=new Scanner(System.in);
	  int n=scn.nextInt();
	  int[] arr=new int[n];
	  for(int i=0;i<arr.length;i++) {
		  arr[i]=scn.nextInt();
	  }
	  int[] rb=new int[arr.length];
	  Stack<Integer> st=new Stack<>();
	  st.push(arr.length-1);
	  
	  
	  for(int i=arr.length-2;i>=0;i--) {
		  while(st.size()>0 && arr[i]<=arr[st.peek()]) {
			  st.pop();
		  }
		  if(st.size()==0) {
			  rb[i]=arr.length;
		  }
		  else {
			  rb[i]=st.peek();
		  }
		  st.push(i);
	  }
	  int[] lb=new int[arr.length];
	  Stack<Integer> st2=new Stack<>();
	  st2.push(0);
	  lb[0]=-1;
	  for(int i=1;i<arr.length;i++) {
		  while(st2.size()>0 && arr[i]<=arr[st2.peek()]) {
			  st2.pop();
		  }
		  if(st2.size()==0) {
			  lb[i]=-1;
		  }else {
			  lb[i]=st2.peek();
		  }
		  st2.push(i);
	  }
	  int maxArea=0;
	  for(int i=0;i<arr.length;i++) {
		  int weight=rb[i]-lb[i]-1;
		  int area=arr[i]*weight;
		  if(area>maxArea) {
			  maxArea=area;
		  }
	  }
	  System.out.println("Largest Area of histogram is" +maxArea);

	}

}
