package Collections.ListInterface.StackInterface;

import java.util.Stack;

public class LearnStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.size());
        System.out.println(st.empty());
        st.push(100);
        st.push(200);
        st.push(300);
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.empty());
        st.add(0, 10);
        System.out.println(st);
        st.add(0, 20);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.remove(Integer.valueOf(10));
        System.out.println(st);
    }
}
