package Day16;

public class C1 extends C2 implements I1,I2 {
public void m1() {
	System.out.println(x);
}

public void m2() {
	System.out.println(y);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
C1 c1obj=new C1();
c1obj.m1();
c1obj.m2();
c1obj.m3();
I1 iobj=new C1();
I2 iobj2=new C1();
iobj.m1();
iobj2.m2();
	}

}
