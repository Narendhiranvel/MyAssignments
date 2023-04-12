package week3.day9;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String sentence = "We learn java basics as part of java sessions in java week1";		
		String[] newSentence = sentence.split(" ");
		String newSentence2 = "";
		Set<String> value=new LinkedHashSet<String>();
		for(String one : newSentence) {
			value.add(one);
		}
		for(String two : value) {
			newSentence2=newSentence2+two+" ";
		}
		System.out.println(newSentence2);
	}

}
