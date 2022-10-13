package com.company.Lesson_24_generic;

import java.util.ArrayList;
import java.util.List;

public class BoxStorageTest {
    public static void main(String[] args) {
       List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(1));
        list.add(new HeavyBox(10));
        list.add(new HeavyBox(3));
        BoxTest store = new BoxTest(list);
        System.out.println(store);

    }


}
