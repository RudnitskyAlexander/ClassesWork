package Lesson_27_Tree;

public class Test {
    public static void main(String[] args) {
        BST<Integer> t1= new BST();
        t1.add(8);
        t1.add(5);
        t1.add(10);
        t1.add(6);
        t1.add(9);
        t1.add(12);

       // t1.inOrder();
        System.out.println();
        System.out.println(t1.contains(7));

       // t1.delete(9);

        t1.inOrder();
        System.out.println();
        t1.preorder(t1.getRoot());
        System.out.println();
        t1.orderRight(t1.getRoot());
    }
}
