package PraticeJava;

public class StringExample {

	public static void main(String[] args) {
//String s="Epsita";
//int x=s.length();
//String rev="";
//for(int i=x-1;i>=0;i--) {
//	rev=rev+s.charAt(i);
//}
//System.out.println("Reverse String is:"+rev);
////Approach2
//String st="Welcome";
//String reve="";
//char a[]=s.toCharArray();
//for(int i=a.length-1;i>=0;i--) {
//	reve=reve+a[i];
//}
//System.out.println("Reverase string is :"+reve);

//Approach-3
StringBuffer y=new StringBuffer("Mario");
System.out.println("reverse String is :"+y.reverse());

//Approach 4-Using StringBuilder class
StringBuilder z=new StringBuilder("Amulya");
System.out.println("reverse string is :"+z.reverse());
	}

}
