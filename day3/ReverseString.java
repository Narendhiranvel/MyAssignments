package week2.day3;

public class ReverseString {

	public static void main(String[] args) {
		String data = "TestLeaf";
		char[] ch = data.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

}
