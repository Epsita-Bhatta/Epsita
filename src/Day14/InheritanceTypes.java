package Day14;

class A{
	int a=100;
	void display() {
		System.out.println(a);
	}
	void show() {
		System.out.println(a);

	}
}
class B extends A{
	int b=200;
	
}
public class InheritanceTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 B bobj=new B();
	System.out.println(bobj.a);
	bobj.display();
	bobj.show();


	}

}
