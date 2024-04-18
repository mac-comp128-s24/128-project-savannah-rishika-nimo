import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;


import org.junit.jupiter.api.Test;

public class HuffmanTest {

    Huffman huffman;
    Huffman queueHuffman;


    public HuffmanTest() {
        huffman = new Huffman("abbc");
        queueHuffman = new Huffman("aaaaaabbbccccddddde");
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
        queueHuffman.insertQueue(queueMap);
        assertEquals(5, queueHuffman.maxHeap.size());
        assertEquals(6, queueHuffman.maxHeap.poll().frequency);
        assertEquals(5, queueHuffman.maxHeap.poll().frequency);
        assertEquals(4, queueHuffman.maxHeap.poll().frequency);
        assertEquals(3, queueHuffman.maxHeap.poll().frequency);
        assertEquals(1, queueHuffman.maxHeap.poll().frequency);

    }


}
