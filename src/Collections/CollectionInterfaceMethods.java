package Collections;

import java.util.List;
import java.util.ArrayList;

public class CollectionInterfaceMethods {
    /* This is a sample code to demonstrate the standard methods present in the Collections interface, demonstrated using and ArrayList.
     * Methods present in the Collections interface:
        * int size()
        * boolean isEmpty()
        * boolean contains(Object o)
        * boolean add(E e)
        * boolean remove(Object o)
        * boolean containsAll(Collection<> c)
        * boolean addAll(Collection<> c)
        * boolean removeAll(Collection<> c)
        * boolean retainAll(Collection<> c)
        * void clear()
        * Object[] toArray()
    */
    public static void main(String[] args) {
        /*
        * An ArrayList can be created as:
            * ArrayList<Integer> list = new ArrayList<>();
            * Requires:
                *  import java.util.ArrayList;
        * Or:
            * List<Integer> list = new ArrayList<>();
            * Requires:
                * import java.util.List;
                * import java.util.ArrayList;
        */
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());                        // Used to get the size of the ArrayList (not to be confused with capacity).
        list.add(10);                                           // Adds "10" to the end of the ArrayList.
        list.add(20);                                           // Adds "20" to the end of the ArrayList.
        list.add(30);                                           // Adds "30" to the end of the ArrayList.
        System.out.println(list.size());
        System.out.println(list);                               // Calls the ".toString()" method.
        list.remove(1);                                   // Removes element from index "1".
        list.remove(Integer.valueOf(10));                    // Removes the specified element.
        System.out.println(list);
        list.add(40);
        list.add(50);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        System.out.println(list2);
        list2.addAll(list);                                     // Used to add all the elements of "list" into "list2".
        System.out.println(list2);
        list2.clear();                                          // Used to remove all the elements from the ArrayList.
        System.out.println(list2);
    }
}
