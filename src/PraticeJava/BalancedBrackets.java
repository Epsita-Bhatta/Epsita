package PraticeJava;
import java.util.*;
public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[' ) {
				st.push(ch);
			}else if(ch==')') {
				boolean val=handlechar(st,'(');
				if(val==false) {
					System.out.println(val);
				}
			}else if(ch=='}') {
				boolean val=handlechar(st,'{');
				if(val==false) {
					System.out.println(val);
				}
			}else if(ch==']') {
				boolean val=handlechar(st,'[');
				if(val==false) {
					System.out.println(val);
				}
		}else {
			
		}
		}
		if(st.size()==0) {
			System.out.println(true);
		}else {
			System.out.println(false);

		}
	}
		public static boolean handlechar(Stack<Character> st,char corresch) {
			if(st.size()==0) {
				return false;
			}else if(st.peek() !=corresch) {
				return false;
			}else {
				st.pop();
				return true;
			}
		}

}
