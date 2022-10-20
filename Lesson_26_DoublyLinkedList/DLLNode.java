package Lesson_26_DoublyLinkedList;

public class DLLNode<T> {
    T data;
    DLLNode<T> next;
    DLLNode<T> prev;

    public DLLNode(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
