package week1.day1;

public class Iphone {
	
	public void makeCall() {
		System.out.println("Calling Arun");
	}
	public void model() {
		System.out.println("12 Pro");
	}

	public static void main(String[] args) {
		Iphone mobile = new Iphone();
		mobile.makeCall();
		mobile.model();
	}

}
