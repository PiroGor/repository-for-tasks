package app.textRevers;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringReversTest {
	@DisplayName("reverseEmptyString")
	@Test
	public void reverseEmptyString() {
		String word = "";
		char[] wordChar=word.toCharArray();
		char[] reversedWord = StringRevers.reverse(word);
		assertArrayEquals(wordChar, reversedWord);
	}
	
	@DisplayName("reverseStringWithOnlyLetters")
	@Test
	public void reverseStringWithOnlyLetters() {
		String word = "qwerty";
		char[] wordChar="ytrewq".toCharArray();
		char[] reversedWord = StringRevers.reverse(word);
		assertArrayEquals(wordChar, reversedWord);
	}

	@DisplayName("reverseStringWithNumbers")
	@Test
	public void reverseStringWithNumbers() {
		String word = "12345";
		char[] wordChar="54321".toCharArray();
		char[] reversedWord = StringRevers.reverse(word);
		assertArrayEquals(wordChar, reversedWord);
	}
	
	@DisplayName("reverseStringWithCharacters")
	@Test
	public void reverseStringWithCharacters() {
		String word = "!@#$%^&*()";
		char[] wordChar="(*&^%$#@!".toCharArray();
		char[] reversedWord = StringRevers.reverse(word);
		assertArrayEquals(wordChar, reversedWord);
	}
	
	@DisplayName("reverseStringWithMixedCharactersAndNumbers")
	@Test
	public void reverseStringWithMixedCharactersAndNumbers() {
		String word = "ab12cd34ef56gh78ij";
		char[] wordChar="jihgfedcba87654321".toCharArray();
		char[] reversedWord = StringRevers.reverse(word);
		assertArrayEquals(wordChar, reversedWord);
	}

}
