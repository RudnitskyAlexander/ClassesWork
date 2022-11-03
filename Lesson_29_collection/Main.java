package Lesson_29_collection;
// https://javarush.ru/groups/posts/1937-klass-collections
// https://javarush.ru/groups/posts/2354-arraylist-v-java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        // Дан код:
//        final List<Integer> l1 = new ArrayList<>();
//        final List<Integer> l2 = new ArrayList<>();
//        l1.add(1); l1.add(2); l1.add(3); l1.add(4); l1.add(5);
//        /*SOLUTION*/
//        System.out.println("l1: " + l1);
//        System.out.println("l2: " + l2);
//
//        На место /*SOLUTION*/ поместите код, который переносит данные из одного массива в другой. Вывод программы должен получиться следующим:
//        l1: []
//        l2: [1, 2, 3, 4, 5]

//        final List<Integer> l1 = new ArrayList<>();
//        final List<Integer> l2 = new ArrayList<>();
//        l1.add(1);
//        l1.add(2);
//        l1.add(3);
//        l1.add(4);
//        l1.add(5);
//
//        l2.addAll(l1);
//        l1.clear();
//
//        System.out.println("l1: " + l1);
//        System.out.println("l2: " + l2);

//        Задача 2
//        вывести второй список с помощью итератора

//        Iterator<Integer> it = l2.iterator();
//
//        System.out.print("l2: ");
//
//        while (it.hasNext()) {
//            System.out.print(it.next() + " ");
//        }

        // Задача 4 разбить текст на слова и записать в коллекцию. если пользователь ввел "up" то вывести коллекцию в прямом порядке,
        // "down" - в обратном порядке. что то другое, заставить повторить ввод.

//        String text = new String();
//        text = ("В основе ArrayList лежит идея динамического массива. А именно, возможность добавлять и удалять элементы, " +
//                "при этом будет увеличиваться или уменьшаться по мере необходимости.");
        String text = " ";
        BufferedReader buf = new BufferedReader((new InputStreamReader(System.in)));
        try {
            text = buf.readLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       // List<String> words = new ArrayList<>();
        String[] wordsAsArray = text.split(" ");
        List<String> wordsAsList = Arrays.asList(wordsAsArray);
        String answer = " ";
        do {System.out.println("Введите up или down");
            try {
                answer = buf.readLine();
            } catch (IOException e) {
                System.out.println(e.getMessage());

            }
        } while (!(answer.equals("up") || answer.equals("down")));
        if (answer.equals("down")) {
            Collections.reverse(wordsAsList);
        }
        System.out.println(wordsAsList);

//        Collections.addAll(str2, strNew);
//
//        System.out.println(str2);

//        for (String strNew : strNew) {
//            System.out.println(strNew);}






        }
    }




