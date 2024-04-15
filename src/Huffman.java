import java.util.HashMap;
import java.util.Map;

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
            } else {
                frequencyMap.put(eachChar, 1);
            }
        }
        return frequencyMap;
    }
}
