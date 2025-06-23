package PraticeJava;
import java.util.Scanner;
public class Checkpangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String input=scn.next();
		input=input.toLowerCase();
		boolean result=checkProgram(input);
		if(result) {
			System.out.println("it is a pangram");
		}else {
			System.out.println("it is not a pangram");

		}
		
		
		

	}
	public static boolean checkProgram(String input) {
		if(input.length()<26) {
			return false;
		}
		for(char i='a';i<='z';i++) {
			if(input.indexOf(i)<0) {
				return false;
			}
			
		}
		return true;
	}

}
