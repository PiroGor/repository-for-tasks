package app.textRevers;

import java.util.HashMap;
import java.util.Map;

public abstract class CreateOutputLook {

    private static Map<String, String> cache = new HashMap<>();

    public static String outputForCountedChars(String sentence){

        Map<Character, Integer> map = CharsCounter.countChars(sentence);

        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Character, Integer> item : map.entrySet()){
            stringBuilder.append("'"+item.getKey()+"'"+"-"+ item.getValue()+"\n");
        }
        cache.put(sentence, sentence + "\n" + stringBuilder.toString());
        return cache.get(sentence);
    }

    public static Map<String,String> getCache(){
        return cache;
    }
}
