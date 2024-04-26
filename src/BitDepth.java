import java.util.*;
import java.util.stream.IntStream;

public class BitDepth {
    private int depth;
    private BitSet bitSet;
    private char letter;


    public BitDepth(int depth, BitSet bitSet, char letter) {
        this.depth = depth;
        this.bitSet = bitSet;
        this.letter = letter;
    }


    public String toString() {
        final StringBuilder buffer = new StringBuilder(depth);
        IntStream.range(0, depth).mapToObj(i -> bitSet.get(i) ? '1' : '0').forEach(buffer::append);
        return buffer.toString();

    }

    public Integer getDepth() {
        return depth;
    }

    public BitSet getBitSet() {
        return bitSet;
    }

    public char getLetter() {
        return letter;
    }


}
