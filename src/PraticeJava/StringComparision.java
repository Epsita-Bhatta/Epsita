package PraticeJava;

public class StringComparision {

	public static void main(String[] args) {
//String s1elcome";
//String s2="Welcome";
//System.out.println(s1==s2);
//System.out.println(s1.equals(s2));
		String s1=new String("Welcome");
		String s2=new String("Welcome");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
//		case-3
	String s3="welcome";
	String s4=new String("welcome");
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
//		case-4
	String y="abc";
	String y1=new String("abc");
	String y2=y1;
	System.out.println(y==y1);
	System.out.println(y.equals(y1));
	System.out.println(y1==y2);
	System.out.println(y1.equals(y2));
	System.out.println(y==y2);
	System.out.println(y.equals(y2));




	
	}

}
