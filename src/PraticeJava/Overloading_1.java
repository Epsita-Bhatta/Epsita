package PraticeJava;

class ABC{
	static int a;
	static void m1() {
		
		System.out.println(a*a);
	}
	static void m1(int a,int b) { //overloading
		System.out.println(a+b);
	}
	
}
class XYZ{
	void m1(int a) {
		
	}
}
public class Overloading_1 {
	
	public static void main(String[] args) {
ABC.a=6;
ABC.m1();
ABC.m1(4,5);
	}

}
