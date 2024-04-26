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


    public HuffmanTree getTree() {
        return tree;
    }

    public Huffman(String input) {
        inputString = input;

        maxHeap = new PriorityQueue<>();
        Map<Character, Integer> frequencMap = readFile();
        maxHeap = createQueue(frequencMap);
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


    public List<BitDepth> encode() {
        List<BitDepth> bdArray = new ArrayList<>();
        for (char ch : inputString.toCharArray()) {
            BitSet bitSet = tree.getCodeMap().get(ch);
            Integer depth = tree.getDepthMap().get(ch);
            BitDepth bitDepth = new BitDepth(depth, bitSet, ch);
            bdArray.add(bitDepth);

        }

        return bdArray;

    }

}

