package Lesson_25_LinkedList;

public interface Stackable<T> {
    void push(T data);
    T peek();
    T pop();
    String toString();
    boolean isEmpty();

}
