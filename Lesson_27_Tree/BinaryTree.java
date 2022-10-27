package Lesson_27_Tree; // binary search tree

public interface BinaryTree<T> {
    boolean isEmpty();

    void add(T data);

    T findMin();

  //  Node<T> findMin(Node<T> root);

    T findMax();

    void delete(T data);

    boolean contains(T data);

    void inOrder();

}
