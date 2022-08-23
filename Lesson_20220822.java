package Lesson_20220822;
// Занятие 18.08.2022 функции

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


public class Lesson_20220822 {
    public static void main(String[] args) {
// вариант 2 задача 1

        int size = 12;
        int[] a = new int[size];

        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
//            a[i] = (int) (Math.random() * 10 - 6);
            a[i]= gen.nextInt(11)-5;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int sum=0;
        for(int i = 0; i < a.length; i++){
            sum=sum+a[i];
        }

        System.out.println("\n Сумма элементов массива равна "+sum);

// вариант 2 задача 2
//        int size = 13;
//        int[] a = new int[size];
//
//        Random gen = new Random();
//        for (int i = 0; i < a.length; i++) {
//            a[i] = gen.nextInt(24) - 12;
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        int multNegat = 1;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < 1&& a[i]!=0) {
//                multNegat = multNegat * a[i];
//            }
//        }
//        System.out.println("\n Произведение отрицательных элементов массива равна " + multNegat);

// вариант 2 задача 2

//        int size = 11;
//        int[] a = new int[size];
//
//        Random gen = new Random();
//        for (int i = 0; i < a.length; i++) {
//            a[i] = gen.nextInt(20);
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//
//        System.out.println("\n");
//
//        int res = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 3 == 0 || a[i] % 5 == 0 || a[i] % 7 == 0) {
//                res = res + 1;
//                System.out.print(a[i] + " ");
//            }
//        }
//        System.out.println("\n Количество чисел которое делится на 3 или 5 или 7 равно :" + res);


// вариант 2 задача 4
//        int size = 15;
//        int[] a = new int[size];
//
//        Random gen = new Random();
//        for (int i = 0; i < a.length; i++) {
//            a[i] = gen.nextInt(25);
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//
//        System.out.println("\n");
//
//        int res = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 != 0) {
//                res = res + a[i];
//                System.out.print(a[i] + " ");
//            }
//        }
//        System.out.println("\n Сумма нечетных элементов массива :" + res);

//Random gen = new Random();
//int k= gen.nextInt(21)-10 // from -10 to 10;
// in the brecketns are quantity of the numerous
// after brackets summ the left border of the line


//

    }//class
} // main
