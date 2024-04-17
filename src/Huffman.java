import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.PriorityQueue;

public class Huffman {

    PriorityQueue<Node> maxHeap;



    public Huffman(String input) {
        maxHeap= new PriorityQueue<>(Collections.reverseOrder());
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

public Heap createQueue(Map<Character, Integer> inputMap){
    for (Map.Entry<Character, Integer> entry: inputMap.entrySet()){
        Node newNode= new Node(entry.getKey(), entry.getValue());
        maxHeap.add(newNode);
    }
   

    
}
