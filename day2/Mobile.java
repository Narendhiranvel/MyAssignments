package week1.day2;

public class Mobile {
	
		String mobileBrandName = "Samsung";
		char mobileLogo = 'S';
		short noOfMobilePiece = 5;
		int modelNumber = 2;
		long mobileImeiNumber = 678987670;
		float mobilePrice = 15678.89f;
		boolean isDamaged = false;
	

	public static void main(String[] args) {
		Mobile md = new Mobile();
		System.out.println("Mobile Brand: "+md.mobileBrandName);
		System.out.println("Logo: "+md.mobileLogo);
		System.out.println("No of pieces: "+md.noOfMobilePiece);
		System.out.println("Model: "+md.modelNumber);
		System.out.println("Imei Number: "+md.mobileImeiNumber);
		System.out.println("Price: "+md.mobilePrice);
		System.out.println("Mobile Damaged: "+md.isDamaged);
		
	}

}
