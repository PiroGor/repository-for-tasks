package app.textRevers;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CharsCounterTest {

    @Test
    void testIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class,() -> CharsCounter.countChars(null));
    }

    @Test
    void testCountCharsEmptyInput(){
        assertEquals(new HashMap<>(),CharsCounter.countChars(""));
    }

    @Test
    void testCountCharsSingleCharacter(){
        Map<Character, Integer> expectedResult = new HashMap<>();
        expectedResult.put('q', 1);
        assertEquals(expectedResult,CharsCounter.countChars("q"));
    }

    @Test
    void testCountCharsMultipleCharacters() {
        Map<Character, Integer> expectedResult = new HashMap<>();
        expectedResult.put('a', 3);
        expectedResult.put('b', 3);
        expectedResult.put('c', 3);
        assertEquals(expectedResult, CharsCounter.countChars("aaabbbccc"));
    }

    @Test
    void testCountCharsMultipleCharactersDifferentCounts() {
        Map<Character, Integer> expectedResult = new HashMap<>();
        expectedResult.put('a', 4);
        expectedResult.put('r', 2);
        expectedResult.put('n', 1);
        expectedResult.put('j', 3);
        assertEquals(expectedResult, CharsCounter.countChars("aaaarrjjjn"));
    }

    @Test
    void testСountCharsOnlyInteger(){
        Map<Character, Integer> expectedResult = new HashMap<>();
        expectedResult.put('1',2);
        expectedResult.put('2',3);
        expectedResult.put('3',1);
        assertEquals(expectedResult,CharsCounter.countChars("112223"));
    }


}