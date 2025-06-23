package Day11;

public class StudentData {
	int sid;
	String Sname;
	char Sgrad;
	
	void PrintData() {
		System.out.println(sid);
		System.out.println(Sname);
		System.out.println(Sgrad);
		
	}
 void Setdata(int id,String name,char grade) {
	 sid=id;
	 Sname=name;
	 Sgrad=grade;
 }
 StudentData(int id,String name,char grade){
	 sid=id;
	 Sname=name;
	 Sgrad=grade;
 }
}
