package PraticeJava;
import java.util.Scanner;
public class ReverseVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		String vowel="aeiouAEIOU";
		char inputarray[]=str.toCharArray();
		int left=0;
		int rht=inputarray.length-1;
		while(left<rht) {
			if(vowel.indexOf(inputarray[left])==-1) {
				left++;
			}
			else if(vowel.indexOf(inputarray[rht])==-1) {
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
System.out.println(new String(inputarray));
	}

}
