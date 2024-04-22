import java.util.*;

public class HuffmanTree {
    private Huffman huffman;
    private FileGUI fileGUI;
    public Node root;
    private HashMap<Character, BitSet> codeMap;


    public HuffmanTree() {
        huffman = new Huffman(fileGUI.getUserInput());
        root = null;
        codeMap = new HashMap<>();


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

    public void callTraversal(){
        BitSet newSet= new BitSet();
        traverseTree(root, 0, newSet);
    }


}
