package Day14;

class A{
int a;
void greet(String wish) {
	System.out.println("Good "+wish);
}
}
class B extends A{
	int b;
	void display() {
		System.out.println(b);
	}
}
class C extends B{
	int c;
	void printMoney() {
		System.out.println(c);
	}
	void show() {
		System.out.println(a);	}
}
	

public class Multilevel {
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
     C cobj=new C();
     cobj.c=300;
     cobj.b=200;
     cobj.a=100;
     cobj.show();
     cobj.display();
     cobj.printMoney();
	}

}
