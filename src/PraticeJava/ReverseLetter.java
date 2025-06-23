package PraticeJava;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		char inputarray[]=str.toCharArray();
		int left=0;
		int rht=str.length()-1;
		
		while(left<rht) {
			if(!Character.isLetter(inputarray[left])) {
				left++;
			}
			else if(!Character.isLetter(inputarray[rht])) {
				rht--;
			}
			else {
				char temp=inputarray[left];
				inputarray[left]=inputarray[rht];
				inputarray[rht]=temp;
				left++;
				rht--;
				
			}
		}
				System.out.println(Arrays.toString(inputarray));
System.out.println(new String(inputarray));
	}

}
