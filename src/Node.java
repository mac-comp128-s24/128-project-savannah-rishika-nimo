
public class Node implements Comparable<Node> {

    public Character data;
    public int frequency;
    public Node left, right;
    public Node parent;

    // /**
    // * Reference to the left child.
    // */
    // public Node<E> left;
    // /**
    // * Reference to the right child.
    // */
    // public Node<E> right;

    // /**
    // * Reference to the parent
    // */
    // public Node<E> parent;

    // constrcutor
    public Node(Character data, int frequency) {
        this.data = data;
        this.frequency = frequency;
        left = null;
        right = null;
        parent = null;
    }


    // This method compares the frequncy

    public int compareTo(Node o) {
        if (this.frequency < o.frequency) {
            return +1;
        } else if (this.frequency > o.frequency) {
            return -1;
        } else {
            return 0;
        }

    }
}

