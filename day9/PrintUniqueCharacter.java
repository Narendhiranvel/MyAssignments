package week3.day9;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String data ="narendhiran";
		String value = "";
		char[] ch = data.toCharArray();
		Set<Character> name = new LinkedHashSet<Character>();
		Set<Character> name1 = new LinkedHashSet<Character>();
		
		for(Character c : ch) {
			boolean add = name.add(c);
			if(!add) {
			name1.add(c);
			}
		}
		for(Character a : name) {
			value = value+a;
		}
		System.out.println(value);
	}

}
