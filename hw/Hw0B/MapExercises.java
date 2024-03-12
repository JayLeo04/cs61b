import org.w3c.dom.ls.LSException;

import java.util.List;
import java.util.TreeMap;
import java.util.Map;
public class MapExercises {
    public static Map<Character,Integer> letterToNumber(){
        Map<Character,Integer> letterMap = new TreeMap<>();
        for(char ch = 'a'; ch <= 'z'; ch++){
            letterMap.put(ch,(int)ch-(int)'a'+1);
        }
        return letterMap;
    }

    public static Map<Integer,Integer> squares(List<Integer> numbers){
        Map<Integer,Integer> square = new TreeMap<>();
        for(int num: numbers){
            square.put(num,num*num);
        }
        return square;
    }

    public static Map<String,Integer> countWords(List<String> words){
        Map<String,Integer> wordCountMap = new TreeMap<>();
        for(String word : words){
            wordCountMap.put(word,wordCountMap.getOrDefault(word,0)+1);
        }
        return wordCountMap;
    }
}
