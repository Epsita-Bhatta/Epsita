package Day10;

public class Employee {
	
	
	int eid;
	String ename;
	String job;
	int Sal;
//	methods
	 void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(Sal);

	}
	

	public static void main(String[] args) {
Employee emp1=new Employee();
emp1.eid=101;
emp1.ename="satya";
emp1.job="HR";
emp1.Sal=50000;
emp1.display();

Employee emp2=new Employee();



	}

}
