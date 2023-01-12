package Lesson43_StreamAPI;

import java.util.*;

// для набора случайно сгенерированных целых чисел нужно:
//количество четных;
// количество нечетных;
// количество равных 0;
// количество равных значению, введенному пользователем

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        final int size = 10;

        List<Integer> mas = new ArrayList<>(size);
        Random gen = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            mas.add(gen.nextInt(201) - 100);
            // mas.add(gen.nextInt(11)-10);
        }

        System.out.println("Введите число ");
        int numb = sc.nextInt();


        System.out.println(mas);

        System.out.println("Четных: " + mas.stream().filter(x -> x % 2 == 0).count());

        System.out.println("Нечетных: " + mas.stream().filter(x -> x % 2 != 0).count());

        System.out.println("Равных 0: " + mas.stream().filter(x -> x == 0).count());


        System.out.println("Равных числу введенному пользователем: " + mas.stream().filter(x -> x == numb).count());

    }

}
