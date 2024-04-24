import java.util.*;
import java.util.stream.IntStream;

public class BitDepth {
    private int depth;
    private BitSet bitSet;


    public BitDepth(int depth, BitSet bitSet) {
        this.depth = depth;
        this.bitSet = bitSet;
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


}
