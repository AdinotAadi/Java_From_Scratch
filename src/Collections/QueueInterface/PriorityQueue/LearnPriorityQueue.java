package Collections.QueueInterface.PriorityQueue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();          // PriorityQueue is implemented as a Min-Heap.
        System.out.println(pq.size());
        pq.offer(10);
        pq.offer(5);
        pq.offer(-1);
        System.out.println(pq);                                     // By default, the PriorityQueue class sorts the elements in ascending order. However, using a custom comparator, a custom sorting/priority can be implemented.
        System.out.println(pq.size());
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }
}
