import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class HuffmanTest {
    
    Huffman huffman;

    public HuffmanTest(){
        huffman= new Huffman("abbc");
    }

    @Test
    public void testReadFile(){
        Map<Character, Integer> newMap = huffman.readFile("abbc");
        assertEquals(3, newMap.size());
        assertEquals(2, newMap.get("b"));
    }

   


}
