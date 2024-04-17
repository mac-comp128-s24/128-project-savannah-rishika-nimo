import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.*;


public class Huffman {


    public Huffman(String input) {

    }

    public Map<Character, Integer> readFile(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        char[] charInput = input.toCharArray();
        for (char eachChar : charInput) {
            if (frequencyMap.get(eachChar) != null) {
                Integer freq = frequencyMap.get(eachChar);
                freq = freq + 1;
                frequencyMap.put(eachChar, freq);
            } else {
                frequencyMap.put(eachChar, 1);
            }
        }
        return frequencyMap;
    }
}

public List<CharFrequency> createList(Map<Character, Integer> inputMap){
    List<CharFrequency> charList= new ArrayList();
    for (Map.Entry<Character, Integer> entry: inputMap.entrySet()){
        CharFrequency newChar= new CharFrequency(entry.getKey(), entry.getValue());
        charList.add(newChar);
    }
    Collections.sort(charList);
    
    return charList;
}
