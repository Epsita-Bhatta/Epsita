package Day15;
class ABC{
	void m1(int a) {
		System.out.println(a);
	}
	void m2(int b) {
		System.out.println(b);
	}
	
}
class XYZ extends ABC{
	void m1(int a) {
		System.out.println(a*a);
	}
	void m2(int a,int b){
		System.out.println(a+b);
	}
}

public class OverloadingVsOverriding {
	
public static void main(String[] args) {
 XYZ xyzobj=new XYZ();
 xyzobj.m1(10);
 xyzobj.m2(8);
 xyzobj.m2(3,5  );
	}
}
