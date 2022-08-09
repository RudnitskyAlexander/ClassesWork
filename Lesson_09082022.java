package com.company;

import java.util.Scanner;

public class Lesson_09082022 {

    public static void main(String[] args) {
//        Series7. Дано целое число N и набор из N вещественных чисел. Вывести в
//        том же порядке округленные значения всех чисел из данного набора (как
//        целые числа), а также сумму всех округленных значений

//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the quantity N:");
//        int n = in.nextInt();
//        double sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("inter the number N" + i + " :");
//            double ni = in.nextDouble();
//            double niNew = Math.round(ni);
//            System.out.println("Rounded number is : " + niNew);
//            sum = sum + niNew;
//        }
//        System.out.println("Total : " + sum);


//выводим квадраты чисел от  10 до 20

//        for (int i = 10; i <= 20; i++) {
//            System.out.println("Квадрат числа : "+i+"= " + i * i);
//    }

// вывести сумму чисел от 1 до n
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the number N:");
//        int n = in.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            sum = sum + i;
//        }
//        System.out.println("Total : " + sum);
// вывести десять пар чисел и вывести большее из чисел

//        Scanner in = new Scanner(System.in);
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.print("Inter the number A:");
//            int a = in.nextInt();
//            System.out.print("Inter the number B:");
//            int b = in.nextInt();
//            if (a > b) {
//                System.out.println(a);
//            } else if (a < b) {
//                System.out.println(b);
//            } else System.out.println("Числа равны ");

//            8. Даны натуральные числа от 20 до 50.Напечатать те из них, которые делятся на 3, но не делятся на 5.

//        for (int i = 20; i <= 50; i++) {
//            if (i % 3 == 0 && i % 5 != 0) System.out.println(i);
//        }
//
//        9. даны натуральные числа от 35 до 87. Найти и напечатать те из них, которые при делении на 7 дают остаток 1, 2
//        или 5.

//        for (int i = 35; i <= 87; i++) {
//            if (i % 7 == 1 || i % 7 == 2 || i % 7 == 5) System.out.println(i);
//        }

//        16. В бригаде, работающей на уборке сена, имеется N сенокосилок.
//        Первая сенокосилка работала m часов, а каждая следующая на 10 минут больше, чем предыдущая.
//        Сколько часов проработала вся бригада?

//        Scanner in = new Scanner(System.in);
//        System.out.print("введите количество косилок N:");
//        int n = in.nextInt();
//        System.out.print("введите количество часов работы косилки M:");
//        int m = in.nextInt();
//        int workTimeInMin = m * 60;
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            sum += workTimeInMin;
//            workTimeInMin += 10;
//        }
//        System.out.println("Бригада всего отработала, часов : " + sum/ 60 + " минут:" + sum % 60);
//
//        17. В ЭВМ вводятся по очереди данные о росте N учащихся класса. Определить средний рост учащихся класса.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите количество учеников : ");
//        int n = in.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Введите рост ученика : ");
//            int height = in.nextInt();
//            sum = sum + height;
//        }
//
//        System.out.println("Средний рост учеников : " + ( sum / n) * 10 /10.0);
//
//        18. Задано натуральное число N. Найти количество натуральных чисел, не превосходящих N и не делящихся ни на одно из чисел 2,3,5.
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число N :");
//        int n = in.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
//                sum = sum + 1;
//                System.out.println(i);
//            }
//        }
//        System.out.println("результат : " + sum);
//
//        19. Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на их произведение. Найти эти числа.

//        for (int x = 10; x <= 99; x++) {
//            for (int y = 10; y <= 99; y++) {
//                int num = 100 * x + y;
//                if (num % (x * y) == 0)
//                    System.out.println(num);
//            }
//        }
//
//        20. даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа:
//        первое число получили путем написания сначала числа А, затем В.
//        Для получения второго числа сначала записали число В, затем А.
//        Найти числа А и В если известно , что первое четырехзначное число нацело делится на 99, а второе на 49.


//        21. Дано натуральное n. вычислить 1/(2 в квадрате) + 1/(4 в квадрате)+ ... + 1/(n в квадрате) ( в квадрате только n)

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        double sum = 0;
//
//        for (int i = 2; i <= n; i += 2) {
//            sum += 1.0 / (i * i);
//        }
//        System.out.println(sum);
//
//        28. Бизнессмен взял ссуду m тысяч рублей в банке под 20% годовых.
//        через сколько лет его долг превысит s тысяч рублей, если за это время он не будет отдавать долг.

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите начальную ссуду :");
//        int nach_summ = in.nextInt();
//        int proc = 3;
//        System.out.println("Введите размер обеспечения :");
//        int s = in.nextInt();
//        double dolg = nach_summ;
//        int k = 0;
//
//        while (dolg <= s) {
//            dolg = dolg + (1 + proc) / 100.0;
//            k++;
//        }
//        System.out.println("Через " + k + " лет");
//
//
//        29. с помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно.
//        int i = 2;
//        while (i <= 100) {
//            System.out.println(i += 2);
//        }

//        30. С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.
//        int i = 1;
//        int sum = 0;
//        while (i <= 99) {
//            System.out.println(i += 2);
//           sum += i;
//           i += 2;
//        }
//        System.out.println(sum);

//        задача про бегуна и приращение дистанции
//
//        double dist = 1.0;
//        int k = 0;
//        while (dist <= 10.0001) {
//            dist *= 1.1;
//            k++;
//        }
//        System.out.println(k);




    }
}
