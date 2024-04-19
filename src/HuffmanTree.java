import java.util.*;

public class HuffmanTree {
    private Huffman huffman;
    private FileGUI fileGUI;
    private Node root;


    public HuffmanTree() {
        huffman = new Huffman(fileGUI.getUserInput());
        root = null;


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

    public void traverseTree() {
        HashMap<Character, BitSet> codeMap = new HashMap<>();
        // BitSet bit = new BitSet();

        // BitSet right = bit.clone();


        // for (int i=0; i<bit.size();i++){

        // }

        // Node currentNode= root.left;


        // if (currentNode.data!=null){
        // codeMap.put(currentNode.data, null)
        // }


    }


}
