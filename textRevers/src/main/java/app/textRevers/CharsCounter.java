package app.textRevers;


import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * @author Anastasiia Nudha
 * @version 0.1.0
 * @since 0.0.1
 */

public class CharsCounter{
    private static Map<String, String> cache = new HashMap<>();

    private CharsCounter(){

    }

    /**
     * Method name: countChars
     *
     * @param sentence The sentence in which be counted chars.
     * @return (Map<Character, Integer>) Map with key of character and count of this character.
     * 											Inside the function: 1. Count characters; 2. Return
     * 											 counted character Map;
     */

    public static Map<Character,Integer> countChars(String sentence){
        Map<Character, Integer> map = new LinkedHashMap<>();

        if (sentence == null) {
            throw new IllegalArgumentException("Text can't be null, please enter a text");
        }

        if (!cache.containsKey(sentence)) {
            for (int i = 0; i < sentence.length(); i++) {
                char letter = sentence.charAt(i);

                if (map.containsKey(letter)) {
                     map.put(letter, map.get(letter) + 1 );
                } else {
                     map.put(letter, 1);
                }
             }
        }
        return map;
    }

    public static String outputForCountedChars(String sentence){
        Map<Character, Integer> map =countChars(sentence);
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<Character, Integer> item : map.entrySet()){
            stringBuilder.append("'" + item.getKey() + "'" + "-" + item.getValue() + "\n");
        }
        cache.put(sentence, sentence + "\n" + stringBuilder);
        return cache.get(sentence);
    }
}
