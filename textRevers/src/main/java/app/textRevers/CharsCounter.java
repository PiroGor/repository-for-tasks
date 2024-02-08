package app.textRevers;


import java.util.Map;
import java.util.LinkedHashMap;

/**
 * @author Anastasiia Nudha
 * @version 0.1.0
 * @since 0.0.1
 */

public abstract class CharsCounter {

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

        if(!CreateOutpuLook.getCache().containsKey(sentence)){

            for(int i=0; i<sentence.length();i++){

             if (map.containsKey(sentence.charAt(i))){

                map.replace(sentence.charAt(i), map.get(sentence.charAt(i)), map.get(sentence.charAt(i))+1);

                } else {

                map.put(sentence.charAt(i), 1);

                }
             }
        }

         return map;
    }

}