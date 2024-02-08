package app.textRevers;


import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author Anastasiia Nudha
 * @version 0.1.0
 * @since 0.0.1
 */

public class CharsCounter {

    private static Map<String, String> cache = new HashMap<>();

    /**
     * Method name: countChars
     *
     * @param sentence The sentence in which be counted chars.
     * @return (String) String display result.
     * 											Inside the function: 1. Checking for null argument exception;
     * 											2. Cache the result to cache map if the argument wasn't counted previously;
     * 											3. Call the method countValue for adding to cache; 4. Return counted chars
     * 											in String from sentence ;
     */

    public static String countChars(String sentence){

    if(sentence==null){
        throw new IllegalArgumentException("Text can't be null, please enter a text");
    }

    if(!cache.containsKey(sentence)){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<sentence.length();i++){
            if (map.containsKey(sentence.charAt(i))){
                map.replace(sentence.charAt(i), map.get(sentence.charAt(i)), map.get(sentence.charAt(i))+1);
            } else {
                map.put(sentence.charAt(i), 1);
            }
        }
        cache.put(sentence, sentence + "\n" + createOutputLook(map));
    }

    return cache.get(sentence);
    }

    /**
     * Method name: countValue
     *
     * @param map The Map of counted chars.
     * @return (String) String display sentence.
     * 											Inside the function: 1. Add to stringBuilder how display must look like;
     * 											2. Return string display version;
     */

    private static String createOutputLook(Map<Character,Integer> map){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Character, Integer> item : map.entrySet()){
            stringBuilder.append("'"+item.getKey()+"'"+"-"+ item.getValue()+"\n");
        }
        return stringBuilder.toString();
    }
}
