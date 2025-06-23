package Day13;

public class Static{

	static int a=10;
	int b=12;
	static void m1()
	{
		a=15;
	}
	void m2() {
		a=20;
		System.out.println(a);
		m1();
	}
	public static void main(String[] args) {
		m1();
		System.out.println(a);
		Static sd=new Static();
		System.out.println(sd.b);
		sd.m2(); 
	}

}
