package Collections.ListInterface;

import java.util.List;
import java.util.ArrayList;

public class ListInterfaceMethods {
    /*
    * The List interface implements the following methods:
        * get(int index)
        * set(int index, E element)
        * add((int index, E element)
        * remove(int index)
        * indexOf(Object o)
        * lastIndexOf(Object o)
        * listIterator()
        * listIterator(int index)
        * subList(int fromIndex, int toIndex)
    */
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        System.out.println(ls);
        System.out.println(ls.get(2));
        System.out.println(ls.get(0));
        ls.set(1, 100);
        System.out.println(ls);
        ls.remove(0);
        System.out.println(ls);
        System.out.println(ls.indexOf(30));
        System.out.println(ls.lastIndexOf(30));
        System.out.println(ls.subList(1, 2));

    }
}
