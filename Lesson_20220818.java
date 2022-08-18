package com.company;
// Занятие 18.08.2022 функции

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Lesson_20220818 {
//    public static void printArray(int[] mas) {
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(mas[i] + " ");
//        }
//    }

    public static void main(String[] args) {

// Array68◦ Дан массив размера N. Поменять местами его минимальный и максимальный элементы.

//        Scanner in = new Scanner(System.in);
//        int size;
//        do {
//            System.out.println("Введите размер массива ");
//            size = in.nextInt();
//        } while (size <= 0);
//        int[] a = new int[size];
//
//        Random gen = new Random();
//        for (int i = 0; i < a.length; i++) {
//            a[i] = gen.nextInt(20);
//        }
//        System.out.print(" Массив A (исходный) : ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        int min = a[0];
//        int minInd = 0;
//        int max = a[0];
//        int maxInd = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < min) {
//                min = a[i];
//                minInd = i;
//            } else if (a[i] > max) {
//                max = a[i];
//                maxInd = i;
//            }
//        }
//        a[minInd] = max;
//        a[maxInd] = min;
//
//        System.out.print(" \n Массив A (измененный) : ");
//        printArray(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }

//        Proc1. Описать функцию PowerA3(A), вычисляющую третью степень числа A и возвращающую ее. С помощью этой процедуры найти третьи степени пяти данных чисел.


//        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Введите целое число ");
//            int x = in.nextInt();
//            System.out.println("Х^3 = " + powerA3(x));
//        }

//        Proc3. Описать функции аMean(X, Y), вычисляющую
//        среднее арифметическое AMean = (X+Y)/2 и gMean (X,Y) среднее геометрическое
//        GMean =X·Y^(1/2) двух положительных чисел X и Y.
//        С помощью этих функций найти среднее арифметическое и среднее геометрическое
//        для пар (A, B), (A, C), (A, D), если даны A, B, C, D

//        int a =5;
//        for(int i=0; i<3; i++){
//            int z= (int)(Math.random()*10);
//            System.out.println(a+ " "+z+ " aMean = "+aMean(a,z));
//            System.out.println(a+ " "+z+ " gMean = "+gMean(a,z));
//        }

//        Proc4◦. Описать 2 функции trianglePS(a), вычисляющую по стороне a
//        равностороннего треугольника его периметр P = 3·a и площадь S = (a^2·√3)/4
//        все параметры являются вещественными). С помощью этой процедуры найти периметры и площади
//        трех равносторонних треугольников с данными сторонами

//        Proc5. Описать функцию rectP (x1, y1, x2, y2), вычисляющую периметр P
//        прямоугольника со сторонами, параллельными осям координат, по координатам (x1, y1), (x2, y2) его противоположных вершин
//        (x1, y1, x2, y2 — входные, P  — выходные параметры вещественного типа). С помощью этой процедуры найти периметры
//        трех прямоугольников с данными противоположными вершинами.
//        Scanner in = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Введите координату Х1 ");
//            int x1 = in.nextInt();
//            System.out.print("Введите координату Х2 ");
//            int x2 = in.nextInt();
//            System.out.print("Введите координату Y1 ");
//            int y1 = in.nextInt();
//            System.out.print("Введите координату Y2 ");
//            int y2 = in.nextInt();
//
//            System.out.println("\n Периметр прямоугольника равен: " + rectP5(x1, x2, y1, y2));
//        }
//      вычислить площадь треугольника по формуле Герона
//      S = (p*(p-a)*(p-b)*(p-c)^1/2)
//      p- полупериметр
//        Проверить с помощью функции, что треугольник со сторонами  a b c  возможен.
//        вычислить площадь 3-х треугольников

//        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Ввведите стороны треугольника :");
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int c = in.nextInt();
//            if (isTriangle(a, b, c)) {
//                System.out.println("Площадь треугольника " + s(a, b, c));
//            } else System.out.println("Такого треугольника не существует ");
//        }

//        Proc6. Описать функцию digitCountSum(K), находящую количество C
//        цифр целого положительного числа K. С помощью этой функции
//        найти количество и сумму цифр для каждого из пяти данных целых чисел.

//        Random gen = new Random();
//        for (int i = 0; i < 5; i++) {
//            int x = gen.nextInt(1_000);
//            System.out.println("В числе " + x + " " + digitCount(x) + " цифр");
//            System.out.println("Сума чисел числа " + x + " " + summ(x));
//        }

//        Proc8◦ . Описать функцию AddRightDigit(D, K), добавляющую к целому положительному числу K справа цифру D (D — входной параметр целого
//        типа, лежащий в диапазоне 0–9, K — параметр целого типа, являющийся  одновременно входным и выходным).
//        С помощью этой функции последовательно добавить к данному числу K справа по одной цифре,
//        выводя результат каждого добавления.


        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int k = in.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите цифру ");
            int d = in.nextInt();
            System.out.println("результат " + addRightDigit(k, d));
        }


    } // END MAIN !!!

//    static int powerA3(int a) {
//        return a * a * a;
//    }
//
//    static double aMean(int x, int y) {
//        return (x + y) / 2.0;
//    }
//
//    static double gMean(int x, int y) {
//        return Math.sqrt(x * y);
//    }
//
//    static double perimetr(double a) {
//        return 3 * a;
//    }
//
//    static double area(double a) {
//        return 3 * a;
//    }
//
//    static double rectP5(int x1, int x2, int y1, int y2) {
//        int a = Math.abs(x1 - x2);
//        int b = Math.abs(y1 - y2);
//        return 2 * a * b;
//    }

    //    static boolean isTriangle(int a, int b, int c) {
//        return a + b > c && a + c > b && b + c > a;
//    }
//
//    static double p(int a, int b, int c) {
//        return (a + b + c) / 2.0;
//    }
//
//    static double s(int a, int b, int c) {
//        double p = p(a, b, c);
//        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
//    }
//
//    //  Proc6
//    // функция определяет количество чисел
//    static int digitCount(int a) {
//        int k = 0;
//        while (a != 0) {
//            a /= 10;
//            k++;
//        }
//        return k;
//    }
//
//    // функция определяет сумму чисел
//    static int summ(int a) {
//        int summ = 0;
//        while (a != 0) {
//            int c = a % 10;
//            a /= 10;
//            summ += c;
//
//        }
//        return summ;
//    }
//  Proc8◦
    static int addRightDigit(int k, int d) {
        return k * 10 + d;
    }


} // END of Class
