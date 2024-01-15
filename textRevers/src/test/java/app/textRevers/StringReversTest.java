package app.textRevers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
in this test class  should be failed reverseStringWithNumbers,
reverseStringWithCharacters and
reverseStringWithMixedCharactersAndNumbers tests
*/

public class StringReversTest {
	@DisplayName("reverseEmptyString")
	@Test
	public void reverseEmptyString() {
		assertEquals("", StringRevers.reverse(""));
	}
	
	@DisplayName("reverseStringWithOnlyLetters")
	@Test
	public void reverseStringWithOnlyLetters() {
		assertEquals("ytrewq", StringRevers.reverse("qwerty"));
	}

	@DisplayName("reverseStringWithNumbers")
	@Test
	public void reverseStringWithNumbers() {
		assertEquals("54321", StringRevers.reverse("12345"));
	}

	@DisplayName("reverseStringWithCharacters")
	@Test
	public void reverseStringWithCharacters() {
		assertEquals("(*&^%$#@!", StringRevers.reverse("!@#$%^&*()"));
	}

	@DisplayName("reverseStringWithMixedCharactersAndNumbers")
	@Test
	public void reverseStringWithMixedCharactersAndNumbers() {
		assertEquals("jihgfedcba87654321", StringRevers.reverse("ab12cd34ef56gh78ij"));
	}

}
