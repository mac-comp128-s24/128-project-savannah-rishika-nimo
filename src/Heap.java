import java.util.*;

public class Heap {

    PriorityQueue<Integer> queue;

    public Heap() {
        queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.add(1);
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(6);


    }

    public void print() {
        System.out.println(queue);
    }


}
