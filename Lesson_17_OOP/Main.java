package Lesson_17_OOP;

import Lesson_16_OOP.Knight;

public class Main {

    public static void main(String[] args) {
//        1. Класс Phone. https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
//     +   Создайте класс Phone, который содержит переменные number, model и weight.
//     +   Создайте три экземпляра этого класса.
//     +   Выведите на консоль значения их переменных.
//     +   Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//     +   Вызвать эти методы для каждого из объектов.

//     +   Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//     +   Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//        Добавить конструктор без параметров.
//     +   Вызвать из конструктора с тремя параметрами конструктор с двумя.
//        Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//        Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
//        Метод выводит на консоль номера этих телефонов.

//        Изменить класс Phone в соответствии с концепцией JavaBean. Смотрите решение задачи в видео 1, видео 2, видео 3, видео 4, видео 5.

        Phone m1 = new Phone();
        System.out.println("\n"+m1);

        Phone m2 = new Phone();
        System.out.println("\n"+m2);

        Phone m3 = new Phone();
        System.out.println("\n"+m3);


        m1.receiveCall("Василий");
        System.out.println(m1.getNumber(1234556));

        m2.receiveCall("Петр");
        System.out.println(m2.getNumber(2561236));

        m2.receiveCall("Алеся");
        System.out.println(m2.getNumber(9874523));

        Phone m4 = new Phone(1234556, "Samsung", 122);
        System.out.println(m4);

        Phone m5 = new Phone(2561236, "iPhone", 131);
        System.out.println(m5);

        Phone m6 = new Phone(9874523, "HONOR", 125);
        System.out.println(m6);




    }
}

