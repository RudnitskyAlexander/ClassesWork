package Lesson_25_LinkedList;

interface UniQueue<T> {
    boolean isEmpty();
    void addElement(T data);
    T removeElement();
    T peekFirst();
}
