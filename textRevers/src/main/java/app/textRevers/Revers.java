package app.textRevers;

import java.util.*;

public class Revers {				//rename class
	/*1.rename method from makeReverse to splitStringToRevers
	  2.make method which return String not just void
	  3.change logic a little bit
	  4.replace splitStringToRevers method from Main to Revers
	*  */
	public static String splitStringToRevers(String str) {
		final ArrayList<String> words=new ArrayList<String>();
		Collections.addAll(words, str.split(" "));
		final ArrayList<String> splitWords=new ArrayList<String>();
		words.forEach(s-> splitWords.add(Revers.reverseWord(s)));
		return String.join(" ",splitWords);
	}
	private static String reverseWord(String word) {		//change the return type and modifier
		char[] wordCharArray = word.toCharArray(); //change name from charWord to wordCharArray
		int startPoint = 0;
		int endPoint = wordCharArray.length - 1;
		while (startPoint <= endPoint) {
			while (startPoint < wordCharArray.length - 1 && !Character.isLetter(wordCharArray[startPoint])) {
				startPoint++;
			}
			while (endPoint > 0 && !Character.isLetter(wordCharArray[endPoint])) {
				endPoint--;
			}

			if (startPoint <= endPoint) {
				char temp = wordCharArray[startPoint];
				wordCharArray[startPoint] = wordCharArray[endPoint];
				wordCharArray[endPoint] = temp;
				startPoint++;
				endPoint--;
			}
		}
        return new String(wordCharArray);
	}
}
