import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.*;


import org.junit.jupiter.api.Test;

public class HuffmanTest {

    Huffman huffman;
    Huffman queueHuffman;


    public HuffmanTest() {
        huffman = new Huffman("abbc");
        queueHuffman = new Huffman("aaaaaabbbccccdddddee");
    }

    @Test
    public void testReadFile() {
        Map<Character, Integer> newMap = huffman.readFile();
        assertEquals(3, newMap.size());
        assertEquals(1, newMap.get('a'));
        assertEquals(2, newMap.get('b'));
        System.out.println(newMap.toString());
    }

    @Test
    public void testCreateQueue() {

        Map<Character, Integer> queueMap = queueHuffman.readFile();
        queueHuffman.createQueue(queueMap);
        assertEquals(5, queueHuffman.maxHeap.size());
        assertEquals(6, queueHuffman.maxHeap.poll().frequency);
        assertEquals(5, queueHuffman.maxHeap.poll().frequency);
        assertEquals(4, queueHuffman.maxHeap.poll().frequency);
        assertEquals(3, queueHuffman.maxHeap.poll().frequency);
        assertEquals(1, queueHuffman.maxHeap.poll().frequency);
    }

    @Test
    public void testTreeTraversal() {
        // HuffmanTree tree = new HuffmanTree();

        // huffman = new Huffman("abbc");
        huffman = new Huffman("aaaaaabbbccccdddddee");
        // newhuffman= new
        huffman.constructTree();
        HuffmanTree tree = huffman.getTree();
        tree.callTraversal();
        // assertEquals(00, tree.codeMap.get('a'));
        for (Map.Entry<Character, BitSet> entry : tree.codeMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // System.out.println(tree.codeMap);
        // assertEquals(01, tree.codeMap.get('b'));


    }


}