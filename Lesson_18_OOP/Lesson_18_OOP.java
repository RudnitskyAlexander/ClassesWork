package Lesson_18_OOP;
// https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks

import com.sun.imageio.plugins.jpeg.JPEGImageReaderSpi;

public class Lesson_18_OOP {
    public static void main(String[] args) {

//        2. Класс Person
//         Создать класс Person, который содержит:
//      1. переменные fullName, age;
//      2. методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
//      3. Добавьте два конструктора  - Person() и Person(fullName, age).
//      4. Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).

//        Person p = new Person();
//        System.out.println(p);
//
//        Person p1 = new Person("Вася Пупкин", 30);
//        System.out.println(p1);
//        p1.move();


//        3. Класс Матрица
//       Создать класс "Матрица". Класс должен иметь следующие переменные:
//       1. двумерный массив вещественных чисел;
//       2. количество строк и столбцов в матрице.

//       Класс должен иметь следующие методы:
//
//        1 сложение с другой матрицей;
//        2 умножение на число;
//        3 вывод на печать;
//        4 умножение матриц - по желанию.
        Matrix a = new Matrix(2, 2);
        a.fillMatrix(1);
        a.print();

        System.out.println();
        Matrix b = new Matrix(2, 2);
        b.fillMatrix(2);
        b.print();

        System.out.println();
        Matrix c = a.addMatrix(b);
        if (c != null) c.print();
        else System.out.println("ошибка");

//        3. Читатели библиотеки
//        Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//
//        1. ФИО,
//        2. номер читательского билета,
//        3. факультет,
//        4. дата рождения,
//        5. телефон.
//        6. Методы takeBook(), returnBook().
//        7. Разработать программу, в которой создается массив объектов данного класса.
//        8. Перегрузить методы takeBook(), returnBook():
//        -takeBook, который будет принимать количество взятых книг.Выводит на консоль сообщение
//        "Петров В. В. взял 3 книги".
//                - takeBook, который будет принимать переменное количество названий книг.Выводит на консоль сообщение
//        "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//                - takeBook, который будет принимать переменное количество объектов класса
//        Book(создать новый класс, содержащий имя и автора книги).Выводит на консоль сообщение
//        "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        9. Аналогичным образом перегрузить метод returnBook ().Выводит на консоль сообщение
//        "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".Или "Петров В. В. вернул 3 книги".Решение


    }

}
