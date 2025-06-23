package Day11;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 StudentData stu1=new StudentData();
// 1 using object reference by variable
//stu1.sid=101;
//stu1.Sname="koy";
//stu1.Sgrad='A';
// using 
stu1.Setdata(101,"Koy",'A');           
stu1.PrintData();
// using a constructor

	}

}
