package com.company;
// Занятие 16.08.2022

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Classes20220816 {
    public static void main(String[] args) {
//найти локальный минимум в целочисленном массиве

//        Scanner in = new Scanner(System.in);
//        int size;
//        do {
//            System.out.println("Введите размер массива ");
//            size = in.nextInt();
//        } while (size <= 0);
//        int[] arr = new int[size];
//        Random gen = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = gen.nextInt(10);
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 1; i < arr.length - 1; i++) {
//            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
//                System.out.println(arr[i] + " на позиции " + i);
//            }
//        }

//        найте наименьшее число в массиве
//        Scanner in = new Scanner(System.in);
//        int size;
//        do {
//            System.out.println("Введите размер массива ");
//            size = in.nextInt();
//        } while (size <= 0);
//        int[] arr = new int[size];
//        Random gen = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = gen.nextInt(10);
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        int min = arr[0];
//        int minIndex = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//                minIndex = i;
//
//                System.out.println(" min = " + min+" index = " + minIndex);
//            }
//        }

//     найти минимальное сред четных позиций

//        Scanner in = new Scanner(System.in);
//        int size;
//        do {
//            System.out.println("Введите размер массива ");
//            size = in.nextInt();
//        } while (size <= 0);
//        int[] arr = new int[size];
//        Random gen = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = gen.nextInt(10);
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        int min = arr[0];
//        int minIndex = 0;
//
//        for (int i = 0; i < arr.length; i+=2) {
//            if (arr[i] < min) {
//                min = arr[i];
//                minIndex = i;
//
//                System.out.println(" min = " + min+" index = " + minIndex);
//            }
//        }
// найти максимальное значение среди нечетных
//        Scanner in = new Scanner(System.in);
//        int size;
//        do {
//            System.out.println("Введите размер массива ");
//            size = in.nextInt();
//        } while (size <= 0);
//        int[] arr = new int[size];
//        Random gen = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = gen.nextInt(10);
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        int max = arr[1];
//        int maxIndex = 1;
//
//        for (int i = 1; i < arr.length; i += 2) {
//            if (arr[i] > max) {
//                max = arr[i];
//                maxIndex = i;
//
//                System.out.println(" max = " + max + " index = " + maxIndex);
//            }
//        }

//        Array51. Даны массивы A и B одинакового размера N. Поменять местами их
//        содержимое и вывести вначале элементы преобразованного массива A, а
//        затем — элементы преобразованного массива B.

//        Scanner in = new Scanner(System.in);
//        int size;
//        do {
//            System.out.println("Введите размер массива ");
//            size = in.nextInt();
//        } while (size <= 0);
//        int[] arr = new int[size];
//        int[] mas = new int[size];
//
//        Random gen = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = gen.nextInt(10);
//            mas[i] = gen.nextInt(21) - 10;
//        }
//        System.out.print(" Массив arr : ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        System.out.print(" Массив mas : ");
//
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(mas[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            int temp = arr[i];
//            arr[i] = mas[i];
//            mas[i] = temp;
//        }
//
//        System.out.print(" \n Массив NEW arr : ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        System.out.print(" Массив NEW mas : ");
//
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(mas[i] + " ");
//        }

//        Array52. Дан массив A размера N. Сформировать новый массив B того же
//        размера, элементы которого определяются следующим образом:
//        B[K] = 2·A[K], если A[K] < 5,
//                A[K]/2 в противном случае

//        Scanner in = new Scanner(System.in);
//        int size;
//        do {
//            System.out.println("Введите размер массива ");
//            size = in.nextInt();
//        } while (size <= 0);
//        int[] a = new int[size];
//        int[] b = new int[size];
//
//        Random gen = new Random();
//        for (int i = 0; i < a.length; i++) {
//            a[i] = gen.nextInt(10);
//        }
//
//        System.out.print(" Массив A : ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//
//        System.out.print(" Массив B : ");
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < 5) {
//                b[i] = 2 * a[i];
//            } else {
//                b[i] = a[i] / 2;
//            }
//            System.out.print(b[i] + " ");
//        }
//
//        Array53. Даны два массива A и B одинакового размера N. Сформировать новый
//        массив C того же размера, каждый элемент которого равен максимальному
//        из элементов массивов A и B с тем же индексом.

//        Scanner in = new Scanner(System.in);
//        int size;
//        do {
//            System.out.println("Введите размер массива ");
//            size = in.nextInt();
//        } while (size <= 0);
//        int[] a = new int[size];
//        int[] b = new int[size];
//        int[] c = new int[size];
//
//        Random gen = new Random();
//        for (int i = 0; i < a.length; i++) {
//            a[i] = gen.nextInt(10);
//            b[i] = gen.nextInt(10);
//        }
//        System.out.print(" Массив A : ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//        System.out.print(" Массив B : ");
//
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//        }
//        System.out.println();
//// формируем массив С
//
//        for (int i = 0; i < c.length; i++) {
//            if (a[i] >= b[i]) {
//                c[i] = a[i];
//            } else {
//                c[i] = b[i];
//            }
//        }
//
//        System.out.print(" Массив C : ");
//        for (int i = 0; i < c.length; i++) {
//            System.out.print(c[i] + " ");
//        }

//        Array54. Дан целочисленный массив A размера N. Переписать в новый целочисленный массив B все четные числа из исходного массива (в том же
//        порядке) и вывести размер полученного массива B и его содержимое.

//        Scanner in = new Scanner(System.in);
//        int size;
//        do {
//            System.out.println("Введите размер массива ");
//            size = in.nextInt();
//        } while (size <= 0);
//        int[] a = new int[size];
//
//        Random gen = new Random();
//        int even_qty = 0;
//        for (int i = 0; i < a.length; i++) {
//            a[i] = gen.nextInt(15);
//            if (a[i] % 2 == 0) even_qty++;
//        }
//        System.out.print(" Массив A : ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//
//        if (even_qty == 0) {
//            System.out.println("В массиве А нет четных чисел");
//        } else {
//            int[] b = new int[even_qty];
//            int j = 0;
//            for (int i = 0; i < a.length; i++) {
//                if (a[i] % 2 == 0) {
//                    b[j] = a[i];
//                    j++;
//                }
//            }
//            System.out.print("\n Массив B : ");
//            for (int i = 0; i < b.length; i++) {
//                System.out.print(b[i] + " ");
//            }
//        }

//        Array55. Дан целочисленный массив A размера N (≤ 15). Переписать в новый
//        целочисленный массив B все элементы с нечетными порядковыми номерами (1, 3, . . .) и вывести размер полученного массива B и его содержимое.
//        Условный оператор не использовать.

//        Scanner in = new Scanner(System.in);
//        int size;
//        do {
//            System.out.println("Введите размер массива ");
//            size = in.nextInt();
//        } while (size <= 0);
//        int[] a = new int[size];
//        int[] b = new int[size / 2];
//
//        Random gen = new Random();
//        for (int i = 0; i < a.length; i++) {
//            a[i] = gen.nextInt(20);
//        }
//        System.out.print(" Массив A : ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//
//        for (int i = 1, j = 0; i < a.length; i += 2, j++) {
//            b[j] = a[i];
//        }
//
//        System.out.println();
//        System.out.println(" Массив B : ");
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//        }

//        Array65. Дан массив A размера N и целое число K (1 ≤ K ≤ N). Преобразовать
//        массив, увеличив каждый его элемент на исходное значение элемента A[K].

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
//
//        System.out.println();
//        System.out.println("Введите номер элемента массива :");
//        int k = in.nextInt();
//
//        for (int i = 0; i < a.length; i++) {
//            a[i] += a[k];
//        }
//        a[k] += a[k];
//
//        System.out.print("\n Массив A (преобразованный) : ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }

//        Array68◦ Дан массив размера N. Поменять местами его минимальный и максимальный элементы.

        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];

        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(20);
        }
        System.out.print(" Массив A (исходный) : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int min = a[0];
        int minInd = 0;
        int max = a[0];
        int maxInd = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minInd = i;
            } else if (a[i] > max) {
                max = a[i];
                maxInd = i;
            }
        }
        a[minInd] = max;
        a[maxInd] = min;

        System.out.print(" \n Массив A (измененный) : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
    }
}
