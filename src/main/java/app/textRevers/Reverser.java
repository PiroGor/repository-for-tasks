package app.textRevers;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Anastasiia Nudha
 * @version 0.1.0
 * @since 0.0.1
 */

public class Reverser {
	/**
	 * Method name: reverseSentence
	 *
	 * @param sentence The sentence what be reversed.
	 * @return (String) Reversed sentence.
	 * 											Inside the function: 1. Splitting String on words;
	 * 											2. Calling the method reverseWord() for each word
	 * 											in sentence; 3. Return joining words in String;
	 */
	public static String reverseSentence(String sentence){
		return Arrays.stream(sentence.split(" "))
				.map(Reverser::reverseWord)
				.collect(Collectors.joining(" "));
	}

	/**
	 * Method name: reverseWord
	 *
	 * @param word The word what be reversed.
	 * @return (String) Reversed word.
	 * 										Inside the function: 1. Type conversion from String to Char;
	 * 									    2. Identify left and right borders in the word; 3. Looking
	 * 									    for the sign on the both side, if the conditions are accepted,
	 * 									    then it changes the places;
	 */
	private static String reverseWord(String word) {
		char[] wordCharArray = word.toCharArray();
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
