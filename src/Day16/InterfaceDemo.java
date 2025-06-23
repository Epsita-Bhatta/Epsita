package Day16;

interface Shape
{
	int length=10;
	int width=20;
	void circle();  
	 default void square(){
		System.out.println("This is Square--default method"); 
	}
	 static void rectangle() {
		     System.out.println("This is Rectangle--static method");
	 }
}
public class  InterfaceDemo implements Shape{
	
	public  void  circle() {
		System.out.println("This is a circle--abstract method");
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		scenario-1
//		 InterfaceDemo idobj=new InterfaceDemo();
//		 idobj.circle();
//		 idobj.square();
//Shape.rectangle();
//		scenario-2
		Shape sh=new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.rectangle();  
		System.out.println(Shape.length*Shape.width);

	}

}
