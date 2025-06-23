package Practicedaily;
import java.util.*;
public class InfixConversion {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String exp=scn.nextLine();
		
		
		Stack<Integer> opnds =new Stack<>();
		Stack<Character> optors=new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char ch=exp.charAt(i);
			if(ch=='(') {
				optors.push(ch);
			}else if(Character.isDigit(ch)) {
				opnds.push(ch-'0');
			}else if(ch==')') {
				while(optors.peek()!='(') {
					char optor=optors.pop();
					int v2=opnds.pop();
					int v1=opnds.pop();
					
					
			int opv=operation(v1,v2,optor);
			opnds.push(opv);
				}
			}else if(ch=='+'|| ch=='-' ||ch=='*' ||ch=='/') {
				
			}
		}
		public static int precedence(char optr) {
			if(optr=='+') {
				return 1;
			}else if(optr=='-') {
				return 1;
			}else if(optr=='*') {
				return 2;
			
		}else {
			return 2;
		} 
	}
public static int operation(int v1,int v2, char optor) {
			if(optr=='+') {
				return v1+v2;
			}else if(optr=='-') {
				return v1-v2;
			}else if(optr=='*') {
				return v1*v2;
			
		}else {
			return v1/v2;
		} 
		
			
		}

}
}
