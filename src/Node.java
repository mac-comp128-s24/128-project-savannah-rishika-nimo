
public class Node implements Comparable<Node> {

    public char data;
    public int frequency;
    public Node left, right;

    // constrcutor
    public Node(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
        left = right = null;
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

