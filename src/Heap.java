
public class Heap {

    public class Node {
        public char data;
        public int frequency;
        public Node left, right;


        public Node(char data, int frequency) {
            this.data = data;
            this.frequency = frequency;
            left = right = null;

        }


    }

    public Node root;


    public Heap() {
        root = null;
    }


}
