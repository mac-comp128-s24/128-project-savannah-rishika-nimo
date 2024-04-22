import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.PriorityQueue;


public class Huffman {

    PriorityQueue<Node> maxHeap;
    String inputString;
    HuffmanTree tree;

    public Huffman(String input) {
        maxHeap = new PriorityQueue<>();
        inputString = input;
        tree = new HuffmanTree();
    }

    public Map<Character, Integer> readFile() {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        char[] charInput = inputString.toCharArray();
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


    public PriorityQueue<Node> createQueue(Map<Character, Integer> inputMap) {
        for (Map.Entry<Character, Integer> entry : inputMap.entrySet()) {
            Node newNode = new Node(entry.getKey(), entry.getValue());
            maxHeap.add(newNode);
        }
        return maxHeap;
    }


    public void constructTree() {
        while (maxHeap.size() > 1) {
            Node firstLeaf = maxHeap.poll();
            Node secondleaf = maxHeap.poll();
            int newFrequency = firstLeaf.frequency + secondleaf.frequency;
            Node parentNode = new Node(null, newFrequency);
            tree.root = parentNode;
            parentNode.left = firstLeaf;
            parentNode.right = secondleaf;
            maxHeap.add(parentNode);
        }
    }

    // Method to encode input data
    public String encodeData(String input, Map<Character, BitSet> codeMap) {
        StringBuilder encodeData = new StringBuilder();
        for (char c : input.toCharArray()) {
            BitSet huffmanCode = codeMap.get(c);
            encodeData.append(bitSetToString(huffmanCode));
        }

        return encodeData.toString();

    }

    // method that turns the bit into a string
    // it takes the binary code and turns it into "1" or "0"
    private String bitSetToString(BitSet bitset) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < bitset.length(); i++) {
            stringBuilder.append(bitset.get(i) ? "1" : "0");

        }
        return stringBuilder.toString();

    }

}

