package Myproj;

public class MobilePhone implements Telephone{
	private String myNumber;
	private boolean isRinging;
	private boolean isPowerOn;
 public MobilePhone(String myNumber) {
	 this.myNumber=myNumber;
 }
 public void powerOn() {
	 isPowerOn=true;
		System.out.println("Phone powered On");
		
	}
	@Override
	public void dial(String phoneNumber) {
		System.out.println("Now ringing :"+phoneNumber+"On phone");

		
	}
	@Override
	public void answer() {
		if(isRinging && isPowerOn) {
			System.out.println("answering the  phone");
			isRinging=false;

		}else {
			System.out.println("phone is not ringing or phone is off.");

		}
		
	}
	@Override
	public boolean callPhone(String phoneNumber) {
		if(phoneNumber==myNumber && isPowerOn) {
			isRinging=true;
			System.out.println("phone ringing");

		}else {
			isRinging=false;
			System.out.println("Either wrong number or phone is off");

		}
		return isRinging;
	}
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}

}
