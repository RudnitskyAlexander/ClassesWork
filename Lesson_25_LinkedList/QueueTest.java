package Lesson_25_LinkedList;

import Lesson_24_generic.HeavyBox;

public class QueueTest {
    public static void main(String[] args) {
        Queue<HeavyBox> q1 = new Queue<>();
        for (int i = 0; i < 3; i++) {
            q1.addElement(new HeavyBox(i + 1));
        }
        System.out.println(q1);
        q1.removeElement();
        System.out.println(q1);

        try {
            q1.removeElement();
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

    }


}

