package PraticeJava;
import java.util.Scanner;

public class MyQue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj=new Scanner(System.in);
       System.out.println("Enter marks:");
       int marks=myObj.nextInt();
       if(marks>90) {
    	   System.out.println("print excellent");
    	   
       }
       else if(80<marks && marks<=90){
    	   System.out.println("print good");
    	   
       }
       else if(70<marks && marks<=80) {
    	   System.out.println("Print fair");
    	   
    	   
       }
       else {
    	   System.out.println("Below bar");
    	   
       }
	}

}
