package Lesson_26_DoublyLinkedList;

import com.sun.xml.internal.ws.client.sei.StubAsyncHandler;

public class Test {
    public static void main(String[] args) {
        DoublyLinkedList<String>str=new DoublyLinkedList<>();
        str.addFirst("Ira");
        str.addLast("Vasya");
        str.addLast("Peter");
        str.addLast("Masha");
        str.addFirst("Sasha");

        System.out.println(str);
    }
}
