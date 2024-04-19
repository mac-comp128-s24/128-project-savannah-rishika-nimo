

public class HuffmanTree {
    private Huffman huffman;
    private FileGUI fileGUI;


    public HuffmanTree() {
        huffman = new Huffman(fileGUI.getUserInput());


        // root= new Node('a', 0);


    }

    public void contructTree() {

        while (!huffman.maxHeap.isEmpty()) {

            if (huffman.maxHeap.size() > 1) {
                Node firstLeaf = huffman.maxHeap.poll();
                Node secondleaf = huffman.maxHeap.poll();
                int newFrequency = firstLeaf.frequency + secondleaf.frequency;
                Node parentNode = new Node('a', newFrequency);// make character null
                parentNode.left = firstLeaf;
                parentNode.right = secondleaf;
                huffman.maxHeap.add(parentNode);

            }

        }


    }


}
