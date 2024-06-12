package Collections.ListInterface.LinkedListInterface;

import java.util.LinkedList;

public class LearnLinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println(ll.size());
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println(ll.size());
        System.out.println(ll);
        ll.remove(Integer.valueOf(10));
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);
    }
}
