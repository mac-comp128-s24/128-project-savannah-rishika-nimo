import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;


import org.junit.jupiter.api.Test;

public class HuffmanTest {
    
    Huffman huffman;
    Huffman queueHuffman;
    Map<Character, Integer> newMap = huffman.readFile();


    public HuffmanTest(){
        huffman= new Huffman("abbc");
        queueHuffman= new Huffman("aaaaaabbbccccddddde");
    }

    @Test
    public void testReadFile(){
        assertEquals(3, newMap.size());
        assertEquals(1, newMap.get('a'));
        assertEquals(2, newMap.get('b'));
        System.out.println(newMap.toString());
    }

    @Test
    public void testCreateQueue(){
        PriorityQueue<Node> heap = queueHuffman.createQueue(queueHuffman.readFile());
        assertEquals(5, heap.size());
        assertEquals(6,  heap.poll().frequency);
        assertEquals(5,  heap.poll().frequency);
        assertEquals(4,  heap.poll().frequency);
        assertEquals(1,  heap.poll().frequency);
        assertEquals(3,  heap.poll().frequency);

    }

   


}
