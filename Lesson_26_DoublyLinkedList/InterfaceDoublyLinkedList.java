package Lesson_26_DoublyLinkedList;

public interface InterfaceDoublyLinkedList<T> {

    boolean isEmpty();

    void addFirst(T data);

    void addLast(T data);

    void removeFirst();

    void removeLast();

    T getFirst();

    T getLast();

    void removeAll();


}


