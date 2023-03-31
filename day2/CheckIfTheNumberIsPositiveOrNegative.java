package week1.day2;

public class CheckIfTheNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		int num1 = -1;
		int num2 = 2;
		
		for(int i = num1; i<=num2; i++) {
			if(i<0) {
				System.out.println(i+" is a negative number");
			}
			else if(i>0) {
				System.out.println(i+" is a positive number");
			}
			else {
				System.out.println(i+" The number is neither positive nor negative");
			}
		}

	}

}
