package Lesson_25_LinkedList;

public class Stack<T> implements Stackable<T> {
    private Node<T> head;

    Stack() {
        head = null;
    }

// true если стек пустой false если не пустой
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    // положить данные в стек
    @Override
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    // прочитать данные с вершины стека
    // если стек пустой то выбрасывает исключение NullPointerException
    @Override
    public T peek() throws NullPointerException {
        if (isEmpty()) throw new NullPointerException("Stack is empty");
        return head.data;
    }

    // удалить узел-вершину стека и вернуть данные, которые были в вершине.
    @Override
    public T pop() {
        T topData = peek();
        head = head.next;
        return topData;
    }

    // преобразовать стек в строку
    @Override
    public String toString() {
        Node<T> current = head;
        StringBuilder buf = new StringBuilder();
        while (current != null) {
            buf.append(current.data);
            buf.append(" "); // "125" хранение в ссылке.
            current = current.next;
        }
        return buf.toString();
    }


}
