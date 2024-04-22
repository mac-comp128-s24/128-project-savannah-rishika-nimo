import java.util.*;

public class HuffmanTree {
    private Huffman huffman;
    private FileGUI fileGUI;
    private Node root;
    private HashMap<Character, BitSet> codeMap;


    public HuffmanTree() {
        huffman = new Huffman(fileGUI.getUserInput());
        root = null;
        codeMap = new HashMap<>();


    }

    public void contructTree() {

        while (huffman.maxHeap.size() > 1) {
            Node firstLeaf = huffman.maxHeap.poll();
            Node secondleaf = huffman.maxHeap.poll();
            int newFrequency = firstLeaf.frequency + secondleaf.frequency;
            Node parentNode = new Node(null, newFrequency);
            root = parentNode;
            parentNode.left = firstLeaf;
            parentNode.right = secondleaf;
            huffman.maxHeap.add(parentNode);
        }
    }

    public void traverseTree(Node node, int depth, BitSet bit) {
        BitSet left = new BitSet();
        BitSet right = new BitSet();
        right = (BitSet) bit.clone();
        right.set(depth);

        if (node.data != null) {
            codeMap.put(node.data, bit);
        }
        traverseTree(node.left, depth + 1, left);
        traverseTree(node.right, depth + 1, right);

        left.or(right); // merge the bits of left and right


    }


}
