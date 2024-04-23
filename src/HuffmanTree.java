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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        preOrderTraverse(root, 1, sb);
        return sb.toString();
    }

    /**
     * Perform a preorder traversal.
     *
     * @param node  The local root
     * @param depth The depth
     * @param sb    The string buffer to save the output
     */
    private void preOrderTraverse(
        Node node,
        int depth,
        StringBuilder sb) {
        for (int i = 1; i < depth; i++) {
            sb.append("  ");
        }
        if (node == null) {
            sb.append("null\n");
        } else {
            sb.append(node.toString());
            sb.append("\n");
            preOrderTraverse(node.left, depth + 1, sb);
            preOrderTraverse(node.right, depth + 1, sb);
        }
    }


}
