package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int num1= -5;
		int num2 = 5;
		int temp;
		
		for(int i=num1; i<=num2; i++) {
			if(i<0) {
				temp = i*(-1);
				System.out.println(temp+" has been converted from negative to positive");
			}
			else {
				System.out.println(i+" is printed");
			}
		}	
	}
}
