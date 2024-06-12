package Collections.ListInterface.ArrayListInterface;

import java.util.ArrayList;

public class LearnArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(1);
        System.out.println(al.size());
        System.out.println(al);
        al.remove(Integer.valueOf(1));
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
    }
}
