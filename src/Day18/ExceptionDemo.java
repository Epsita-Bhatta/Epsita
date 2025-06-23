package Day18;
import java.util.Scanner;
public class ExceptionDemo {

	public static void main(String[] args) { 
System.out.println("The program has started");
Scanner sc=new Scanner(System.in);
 System.out.println("enter a number");;
 int n=sc.nextInt();
 try {
 System.out.println(100/n);
 }
 catch(Exception e){
	 
	 System.out.println("Invalid Input,Please try again");
	 System.out.println(e.getMessage());
	 
 }
 System.out.println("The program has completed");
	}

	
} 
