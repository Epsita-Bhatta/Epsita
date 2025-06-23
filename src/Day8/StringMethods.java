package Day8;
import java.util.Arrays;
public class StringMethods {

	public static void main(String[] args) {
		String s="   Epsita   ";
//		String m =new String("Epsita");
		System.out.println(s);
		
//		length() -returns length of a string
		System.out.println(s.length());
//		concat() - joining strings
		
		System.out.println(s.concat(" Bhatta").concat(" Mishra"));
		
//		trim() --remove spaces from left and right side
		System.out.println(s);
		System.out.println(s.length());
		
		System.out.println(s.trim().length());
		
//		charAt() --returns a character  from a string based on index
		s="Welcome";
		System.out.println(s.charAt(0));
//		contains() -returns true/false
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("wel"));
//equals() ,equalsIgnoreCase() - compare strings
		s="Epsita";
		String s1="Epsita";
		System.out.println(s==s1);
		System.out.println(s1.equals(s));
		System.out.println(s.equals("epsita"));
		System.out.println(s.equalsIgnoreCase("epsita"));
		
//		replace()-replace single and multiple sequence of character in a string
		s="Welcome to the session of life coach Epsita ";
		System.out.println(s.replace('t', 'X'));
		System.out.println(s.replace("Epsita", "Maria").replace("coach", "Trainer"));
		
//		substring()- extract substring from the main String
		s="Mythology";
		System.out.println(s.substring(0,5));
		System.out.println(s.substring(0));
		
// 	toUpperCase,toLowerCase()
		s="Jyoshna";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
//		split()-split the string into multiple parts based on delimeter
		s="epsita@gmail.com";
		String a[]=s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
				
//		ex1
		String amount="$15,20,30";
		System.out.println(amount.replace("$","").replace(",", ""));
		
//		ex2
		s="abc,123@XYz";
		String b[]=s.split("@");
		System.out.println(Arrays.toString(b));
		String b1[]=b[0].split(",");
		System.out.println(Arrays.toString(b1));
		System.out.println(b1[0]);
		System.out.println(b1[1]);
		System.out.println(b[1]);
		//  * % ^ ( ) - you can not use these as delimeters
	String name="Amulya";
	System.out.println(name.replace("A", "a").contains("amul"));
	System.out.println(name.toLowerCase().contains("amul"));
	}
}
