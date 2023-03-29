package week1.day1;

public class Mobile {
	
	public void sendSms() {
		System.out.println("Message from john");
	}
	public void makeCall() {
		System.out.println("Calling john");
	}

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.sendSms();
		mobile.makeCall();

	}

}
