package com.company.Lesson_24_generic;
//1. Создать динамический массив
//        Создать коллекцию, содержащую объекты класса HeavyBox.
//        Распечатать его содержимое используя for each.
//        Изменить вес первого ящика на 1.
//        Удалить последний ящик.
//        Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
//        Удалить все ящики.

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoxTest {
    private List<HeavyBox> listOfBoxes;

    public BoxTest(List<HeavyBox> list) {
        listOfBoxes = new ArrayList<>();
    }

    public BoxTest(ArrayList<HeavyBox> listOfBoxes) {
        // this.listOfBoxes=listOfBoxes; так нельзя делать!!!
        // нужно скопировать содержимое параметра в содержимое поля
//        for (int i = 0; i < listOfBoxes.size(); i++) {
//            this.listOfBoxes.add(listOfBoxes.get(i));
//        }
        listOfBoxes = new ArrayList<>();
//        this();
        this.listOfBoxes.addAll(listOfBoxes);
    }

    @Override
    public String toString() {
        return "BoxTest{" +
                "listOfBoxes=" + listOfBoxes +
                '}';
    }

    public boolean changeWeighOfBox(int index, int change) {
        boolean result = true;
        if (index < 0 || index > listOfBoxes.size() - 1) result = false;
        if (!listOfBoxes.get(index).changeWeight(change)) result = false;
//        listOfBoxes.get(index).setWeight(listOfBoxes.get(index).getWeight()+change);
        return result;
    }

    public HeavyBox[] getArray(){
        return (HeavyBox[]) listOfBoxes.toArray();
    }


}
