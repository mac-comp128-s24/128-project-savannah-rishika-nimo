import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;


import org.junit.jupiter.api.Test;

public class HuffmanTest {
    
    Huffman huffman;
    Map<Character, Integer> newMap = huffman.readFile("abbc");

    public HuffmanTest(){
        huffman= new Huffman("abbc");
    }

    @Test
    public void testReadFile(){
        assertEquals(3, newMap.size());
        assertEquals(1, newMap.get('a'));
        assertEquals(2, newMap.get('b'));
        System.out.println(newMap.toString());
    }

    @Test
    public void testCreateList(){
        List<CharFrequency> newList = huffman.createList(newMap);
        assertEquals(4, newList.size());


    }

   


}
