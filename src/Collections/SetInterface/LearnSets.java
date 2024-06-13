package Collections.SetInterface;

import java.util.*;

public class LearnSets {
    /*
     * Sets are data structures that contain unique elements only, they don't allow us to store duplicate elements.
     * In Java, Sets are of the following types:
     * EnumSet: A specialized Set implementation for use with enum types. All the elements in an enum set must come from a single enum type that is specified, explicitly or implicitly, when the set is created. Enum sets are represented internally as bit vectors. This representation is extremely compact and efficient. The space and time performance of this class should be good enough to allow its use as a high-quality, typesafe alternative to traditional int-based "bit flags".
     * HashSet: Computes a hash value for each of the elements and stores them in a random order based on tha computer hash value. Add and Remove operations are O(1) in time.
     * LinkedHashSet: Internally uses a linked list to store the elements in the set. Is slower, Adding is O(1) time, but removing in O(n) in time.
     * TreeSet: Uses a binary search tree to sort the elements of the set. Time complexity of most of the operations is O(logn).
     */
    enum Color {
        RED, YELLOW, GREEN
    }

    public static void main(String[] args) {
        EnumSet<Color> es= EnumSet.allOf(Color.class);              // EnumSets are rarely used.

        System.out.println("HashSet:");
        Set<Integer> s1 = new HashSet<>();
        System.out.println(s1.size());
        s1.add(10);
        s1.add(90);
        s1.add(20);
        System.out.println(s1);
        System.out.println(s1.contains(10));
        System.out.println(s1.contains(100));

        System.out.println("LinkedHashSet:");
        Set<Integer> s2 = new LinkedHashSet<>();
        System.out.println(s2.size());
        s2.add(10);
        s2.add(90);
        s2.add(20);
        System.out.println(s2);
        System.out.println(s2.contains(10));
        System.out.println(s2.contains(100));

        System.out.println("TreeSet:");
        Set<Integer> s3 = new TreeSet<>();
        System.out.println(s3.size());
        s3.add(10);
        s3.add(90);
        s3.add(20);
        System.out.println(s3);
        System.out.println(s3.contains(10));
        System.out.println(s3.contains(100));
    }
}

/*
* Output:
    * HashSet:
        0
        [20, 10, 90]
        true
        false
    * LinkedHashSet:
        0
        [10, 90, 20]
        true
        false
    * TreeSet:
        0
        [10, 20, 90]
        true
        false
 */
