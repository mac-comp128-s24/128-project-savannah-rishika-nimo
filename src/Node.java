
public class Node implements Comparable<Node> {

    public Character data;
    public int frequency;
    public Node left, right;
    public Node parent;

    public Node(Character data, int frequency) {
        this.data = data;
        this.frequency = frequency;
        left = null;
        right = null;
        parent = null;
    }

    public int compareTo(Node o) {
        if (this.frequency < o.frequency) {
            return -1;
        } else if (this.frequency > o.frequency) {
            return +1;
        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (data != null) {

            return sb.append(data.toString() + frequency).toString();

        } else {

            return sb.append(frequency).toString();
        }
    }

}

