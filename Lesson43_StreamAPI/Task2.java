package Lesson43_StreamAPI;


//для набора названий городов(города могут повторяться)нужно:
//        показать все города;
//        показать все города с названием длиннее шести символов;
//        посчитать сколько раз встречается город,чье назавние ввел пользователь;
//        показать все города,котороые начинаются на заданную букву;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        List<String> towns = new ArrayList<>();
        towns.add("Минск");
        towns.add("Брест");
        towns.add("Париж");
        towns.add("Москва");
        towns.add("Киев");
        towns.add("Нью-Йорк");
        towns.add("Лондон");
        towns.add("Мюнхен");
        towns.add("Турин");
        towns.add("Вена");
        //System.out.println(towns.toString());
        List<String> dupTowns = new ArrayList<>();
        final int dupSize = 30;

        for (int i = 0; i < dupSize; i++) {
            Random gen = new Random();
            dupTowns.add(towns.get(gen.nextInt(towns.size())));
        }

        //System.out.println(dupTowns.toString());

        dupTowns.stream().forEach(x -> System.out.print(x + ", "));
        System.out.println("\n==============");

        //  длинее 6 символов

        dupTowns.stream().filter(x -> x.length() > 6).forEach(x -> System.out.print(x + ", "));
        System.out.println("\n==============");
        System.out.println(dupTowns.stream().filter(x -> x.equals("Минск")).count());
        System.out.println("\n==============");
        dupTowns.stream().filter(x -> x.charAt(0) == 'М').forEach(x -> System.out.println(x + ", "));

    }

}
