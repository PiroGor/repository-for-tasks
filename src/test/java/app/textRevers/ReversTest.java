package app.textRevers;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
in this test class  should be failed reverseStringWithNumbers,
reverseStringWithCharacters and
reverseStringWithMixedCharactersAndNumbers tests
*/

public class ReversTest {
	@DisplayName("reverseEmptyString")
	@Test
	public void reverseEmptyString() {
		assertEquals("", Reverser.reverseSentence(""));
	}
	
	@DisplayName("reverseStringWithOnlyLetters")
	@Test
	public void reverseStringWithOnlyLetters() {
		assertEquals("ytrewq", Reverser.reverseSentence("qwerty"));
	}

	@DisplayName("reverseStringWithNumbers")
	@Test
	public void reverseStringWithNumbers() {
		assertEquals("12345", Reverser.reverseSentence("12345"));
	}

	@DisplayName("reverseStringWithCharacters")
	@Test
	public void reverseStringWithCharacters() {
		assertEquals("!@#$%^&*()", Reverser.reverseSentence("!@#$%^&*()"));
	}

	@DisplayName("reverseStringWithMixedCharactersAndNumbers")
	@Test
	public void reverseStringWithMixedCharactersAndNumbers() {
		assertEquals("ji12hg34fe56dc78ba", Reverser.reverseSentence("ab12cd34ef56gh78ij"));
	}

}
