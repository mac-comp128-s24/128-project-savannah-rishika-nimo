import java.util.*;

public class HuffmanTree {
    public Node root;
    public HashMap<Character, BitSet> codeMap;


    public HuffmanTree() {
        root = null;
        codeMap = new HashMap<>();
    }


    public void traverseTree(Node node, int depth, BitSet bit) {

        if (node != null) {
            System.err.println(node.data);
        }

        BitSet left = new BitSet();
        BitSet right = new BitSet();
        right = (BitSet) bit.clone();
        right.set(depth);

        if (node == null)
            return;

        if (node.data != null) {
            codeMap.put(node.data, bit);
        }
        traverseTree(node.left, depth + 1, left);
        traverseTree(node.right, depth + 1, right);

        // left.or(right); // merge the bits of left and right
    }

    public void callTraversal() {
        BitSet newSet = new BitSet();
        traverseTree(root, 0, newSet);
    }


}
