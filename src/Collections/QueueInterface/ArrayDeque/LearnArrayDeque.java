package Collections.QueueInterface.ArrayDeque;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        System.out.println(dq.size());
        dq.offer(10);                                       // Inserts element at the end of the Deque.
        dq.offerFirst(20);                                  // Inserts elements at the start of the Deque.
        dq.offerLast(30);                                   // Inserts element at the end of the Deque.
        System.out.println(dq);
        System.out.println(dq.size());
        dq.pollFirst();                                        // Removes element from the beginning of the Deque.
        System.out.println(dq);
        dq.pollLast();                                         // Removes element from the end of the Deque.
        System.out.println(dq);
        /*
        * Similar functionalities are offered by:
            * To add elements:
                * addFirst(), addLast()
            * To remove elements:
                * removeFirst(), removeLast()
         * Stack can be simulated by using an ArrayDeque by:
            * Adding elements at one end, say rear: offerLast()
            * Removing elements from the same end: pollLast()
        * It is recommended to use ArrayDeque class to implement a stack, not the Stack class. This is because of the reason that the Stack class utilizes the Vector class, which is slower due to synchronisation.
        * Stack methods offered by ArrayDeque:
            * Adding elements: push()
            * Removing elements: pop()
        * Similarly, it is recommended to use ArrayDeque class to implement a queue.
        * Queue methods offered by ArrayDeque:
            * Adding elements: offer() (preferred), add()
            * Removing elements: poll() (preferred), remove()
        */
    }
}
