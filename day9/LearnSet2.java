package week3.day9;

import java.util.LinkedHashSet;
import java.util.Set;
public class LearnSet2 {

	public static void main(String[] args) {
		
		String data ="google";
		char[] ch = data.toCharArray();
		Set<Character> name = new LinkedHashSet<Character>();
		Set<Character> name1 = new LinkedHashSet<Character>();
		
		for(Character c : ch) {
			boolean add = name.add(c);
			if(!add) {
			name1.add(c);
			}
		}
		System.out.println(name);
		System.out.println(name1);
		
		//List<Integer> getData = new ArrayList<Integer>();
	}

}
