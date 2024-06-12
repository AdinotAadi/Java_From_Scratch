package Collections.ListInterface.Vector;

import java.util.Vector;

public class LearnVectors {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        System.out.println(v.size());
        v.add(20);
        v.add(40);
        v.add(60);
        System.out.println(v);
        System.out.println(v.size());
        v.remove(1);
        System.out.println(v);
        v.remove(Integer.valueOf(60));
        System.out.println(v);
    }
}
