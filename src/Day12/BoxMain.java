package Day12;

public class BoxMain {

	public static void main(String[] args) {
		Box b1=new Box();
		System.out.println(b1.volume());
		Box b2=new Box( 1.5,6.0,2.3);
		System.out.println(b2.volume());
Box b3=new Box(3.4);
System.out.println(b3.volume());
	}

}
