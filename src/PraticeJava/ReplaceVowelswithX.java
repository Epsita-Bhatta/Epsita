package PraticeJava;
import java.util.Scanner;
public class ReplaceVowelswithX {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		StringBuilder sb=new StringBuilder();
		char inputarray[]=str.toCharArray();
		for(char character:inputarray) {
			if(isVowel(character)) {
				sb.append('x');
			}else {
				sb.append(character);
			}
		}
		System.out.println(sb.toString());
	}
		
		public static boolean isVowel(char currentchar) {
			if(currentchar=='a'||currentchar=='A'||currentchar=='e'||currentchar=='E'||currentchar=='i'||currentchar=='I'||currentchar=='o'||currentchar=='O'||
					currentchar=='u'||currentchar=='U'){
				return true;
				
			}else {
				return false;
			}
			
		}

	

}
