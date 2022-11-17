package Lesson_32_Set;
// https://vertex-academy.com/tutorials/ru/set-v-java-hashset/

import java.util.HashSet;
import java.util.Set;

public class Lesson32 {
    //работа с HashSet
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("яблоко");
//        set.add("Мама");
//        set.add("мыла");
//        set.add("Алла");
//        set.add("раму");
//        set.add("мыло");
//        set.add("мыло");
//
//        for (String s : set) {
//            System.out.println(s);
//        }
//
//        System.out.println("=================");
//        //remove
//        set.remove("мыло");
//
//        for (String s : set) {
//            System.out.println(s);
//        }
//
//        //contains
//
//        System.out.println(set.contains("Мама"));
//        //size
//        System.out.println("Размер множества " + set.size());
////clear
//        set.clear();
//        //isEmpty
//        System.out.println(set.isEmpty());

        Set<String> countr = new HashSet<>();
        countr.add("США");
        countr.add("Япония");
        countr.add("Багамы");
        countr.add("Индия");
        countr.add("Россия");
        countr.add("Беларусь");
        countr.add("Украина");

        for (String s : countr) {
            System.out.println(s);
        }

        System.out.println("В списке содержится страна Россия : " + countr.contains("Россия"));

    }
}
