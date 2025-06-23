package Myproj;

public class DeskPhone implements Telephone{
private String myNumber;
private boolean isRinging;
public DeskPhone(String myNumber) {
	this.myNumber=myNumber;
}
@Override
public void powerOn() {
	System.out.println("Desk phone is always powered");
	
}
@Override
public void dial(String phoneNumber) {
	System.out.println("Now ringing :"+phoneNumber+"On DeskPhone");

	
}
@Override
public void answer() {
	if(isRinging) {
		System.out.println("answering the Desk phone");
		isRinging=false;

	}else {
		System.out.println("phone is not ringing");

	}
	
}
@Override
public boolean callPhone(String phoneNumber) {
	if(phoneNumber==myNumber) {
		isRinging=true;
		System.out.println("phone ringing");

	}else {
		isRinging=false;
		System.out.println("The number didnt match");

	}
	return isRinging;
}
@Override
public boolean isRinging() {
	// TODO Auto-generated method stub
	return isRinging;
}

}
