package Day15;

class Bank{
	double roi() {
		return 0;
	}
}
class ICICI extends Bank{
	double roi() {
		return 10.5;	
	}
}
class SBI extends Bank{
	double roi() {
		return 11.5;
	}
}

public class Overridingconcept {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ICICI ic=new ICICI();
  System.out.println(ic.roi());
	}

}
