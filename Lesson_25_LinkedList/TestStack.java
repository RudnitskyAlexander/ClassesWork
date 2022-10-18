package Lesson_25_LinkedList;

public class TestStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        for (int i = 1; i < 6; i++) {
            st.push(i);
        }
        System.out.println("[ "+st+" ]");

        for (int i = 1; i < 6; i++) {
            st.pop();
        }
        System.out.println("[ "+st+" ]");

        try {
            st.pop();

        } catch (NullPointerException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }
}
