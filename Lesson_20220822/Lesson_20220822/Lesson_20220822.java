package Lesson_20220822;
// Занятие 18.08.2022 функции

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


public class Lesson_20220822 {

    // заполнение массива случайными числами

    static void fillRandom(int[] mas, int left, int right) {
        Random gen = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = gen.nextInt(right - left + 1) + left;
        }
    }

    static void print(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    static int sumOrArray(int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        return sum;
    }

    static int multOfArray(int[] mas) {
        int mult = 1;
        for (int i = 0; i < mas.length; i++) {
            mult *= mas[i];
        }
        return mult;
    }

    static double averArray(int[] mas) {
        int res = 0;
        for (int i = 0; i < mas.length; i++) {
            res += mas[i];
        }
        return (double) res / mas.length;
    }

    static int countLessK(int[] mas, int k) {
        int qut = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < k) qut++;
        }
        return qut;
    }

    static int numElem(int[] mas, int k) {
        int res = -1;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > k) {
                res = i;
                break;
            }
        }
        return res;
    }

    static void printLessRight(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] < mas[i + 1]) {
                System.out.println(mas[i] + " ");
            }
        }
        System.out.println();
    }

    static int printQuantity(int[] mas) {
        int qut = 0;
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] < mas[i + 1]) {
                qut++;
            }
        }
        return qut;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        fillRandom(arr, -10, 10);
        print(arr);

//Series1◦. Даны десять целых чисел. Найти их сумму.
// System.out.println("\n Сумма всех элементов массива : "+sumOrArray(arr));

//Series2. Даны десять целых чисел. Найти их произведение.
// System.out.println("\n Произведение всех элементов массива : "+multOfArray(arr));

//Series3. Даны десять целых чисел. Найти их среднее арифметическое.
// System.out.println("\n Среднее арифметическое всех элементов массива : "+averArray(arr));

//        Series14. Дано целое число K и массив из дести целых чисел;
//        Вывести количество чисел в наборе, меньших K.
//        int k = in.nextInt();
//        System.out.println("Количество элементов меньше К : " + countLessK(arr, k));

        //Series15◦Дано целое число K и набор ненулевых целых чисел;
        //  Вывести номер первого числа в наборе, большего K. Если таких чисел нет, то вывести -1.

        int k = in.nextInt();
        System.out.println("Номер первого элемента >K " + numElem(arr, k));

//        Series19◦ Дано целое число N (> 1) и набор из N целых чисел. Вывести те
//        элементы в наборе, которые меньше своего правого соседа, и количество K
//        таких элементов.


// вариант 2 задача 1

//        int size = 12;
//        int[] a = new int[size];
//
//        Random gen = new Random();
//        for (int i = 0; i < a.length; i++) {
////            a[i] = (int) (Math.random() * 10 - 6);
//            a[i]= gen.nextInt(11)-5;
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        int sum=0;
//        for(int i = 0; i < a.length; i++){
//            sum=sum+a[i];
//        }
//
//        System.out.println("\n Сумма элементов массива равна "+sum);

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
//            a[i] = gen.nextInt(21);
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
//        int[] arr = new int[size];
//
//        Random gen = new Random();
//        for (int i = 0; i < a.length; i++) {
//            arr[i] = gen.nextInt(26);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println("\n");
//
//        int res = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                res = res + arr[i];
//                System.out.print(arr[i] + " ");
//            }
//        }
//        System.out.println("\n Сумма нечетных элементов массива :" + res);


//        static int massiv ( int size, int limit){
//            int size = 15;
//            int[] a = new int[size];
//            Random gen = new Random();
//
//            for (int i = 0; i < a.length; i++) {
//                a[i] = gen.nextInt(26);
//            }
//            return int[] arr;
//        }

//        static int printArr ( int arr[]){
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            return arr[];
//        }


//        static int addRightDigit(int k, int d) {
//            return k * 10 + d;
//        }


//Random gen = new Random();
//int k= gen.nextInt(21)-10 // from -10 to 10;
// in the brecketns are quantity of the numerous
// after brackets summ the left border of the line


//

    }//class
} // main
