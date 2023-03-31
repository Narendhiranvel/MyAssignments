package week1.day2;

public class PrintOddNumber {

	public static void main(String[] args) {
		int num = 45;
		for(int i =0; i<num; i++) {
			if(i % 2 ==1) {
				System.out.println(i+" is a odd number");
			}
		}
	}
}
