package Lesson_20220908;
// массивы+ вложенные массивы

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Lesson_20220908 {
    static void fillMatrix(int[][] arr, int left, int right) {
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {//arr.lenght  количество строк в матрице
            for (int j = 0; j < arr[i].length; j++) {//arr.lenght  количество столбцов в строке
                arr[i][j] = gen.nextInt(right - left + 1) + left;
            }
        }
    }

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void matrix1(int[][] arr) {// matrix 1
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 10 * i;
            }
        }
    }

    static void matrix2(int[][] arr) {// matrix 2
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 5 * j;
            }
        }
    }

    static void showString(int[][] arrName, int k) {// matrix 7
        if (k > arrName.length - 1 || k < 0) {
            System.out.println(" Неверный номер строки.");
        } else {
            for (int i = 0; i < arrName[k].length; i++) {
                System.out.println(arrName[k][i] + " ");
            }
            System.out.println();
        }
    }

    static void showRow(int[][] arrName, int k) {// matrix 8
        if (k >= arrName[0].length || k < 0) {
            System.out.println(" Неверный номер столбца.");
        } else {
            for (int i = 0; i < arrName.length; i++) {
                System.out.println(arrName[i][k] + " ");
            }
            System.out.println();
        }
    }

    static void printEvenRow(int[][] arrayName) {
        for (int i = 0; i < arrayName.length; i += 2) {
            for (int j = 0; j < arrayName[i].length; j++) {
                System.out.print(arrayName[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int sumOfRow(int[][] arrName, int k) {
        int sum = 0;
        if (k >= arrName.length || k < 0) {
            System.out.println(" Неверный номер строки.");
        } else {
            for (int j = 0; j < arrName[k].length; j++) {
                sum += arrName[k][j];
            }
        }
        return sum;
    }


    public static void main(String[] args) {

        final int n = 10;
        final int m = 10;
        int[][] mas = new int[n][m];


//        fillMatrix(mas, 0, 10);
//        printMatrix(mas);

//        Matrix1. Даны целые положительные числа M и N. Сформировать целочисленную матрицу размера M × N,
//        у которой все элементы I-й строки имеют значение 10·I (I = 1, . . ., M).

//        matrix1(mas);
//        printMatrix(mas);

//        Matrix2. Даны целые положительные числа M и N. Сформировать целочисленную матрицу размера M × N,
//        у которой все элементы J-го столбца имеют значение 5·J (J = 1, . . ., N).
//        matrix2(mas);
//        printMatrix(mas);

//        Matrix7◦. Дана матрица размера M × N и целое число K (0 ≤ K < M). Вывести
//        элементы K-й строки данной матрицы.
//        fillMatrix(mas, 0, 10);
//        System.out.println(" Введите номер строки ");
//        Scanner in = new Scanner(System.in);
//        int k = in.nextInt();
//
//        showString(mas, k);

//        Matrix8. Дана матрица размера M × N и целое число K (1 ≤ K ≤ N). Вывести
//        элементы K-го столбца данной матрицы.
//        fillMatrix(mas, 0, 10);
//        System.out.println(" Введите номер столбца ");
//        Scanner in = new Scanner(System.in);
//        int k = in.nextInt();
//
//        showRow(mas, k);

//        Matrix9. Дана матрица размера M × N. Вывести ее элементы, расположенные
//        в строках с четными номерами (0, 2, 4, . . .). Вывод элементов производить
//        по строкам, условный оператор не использовать
//        fillMatrix(mas, -10, 10);
//        printMatrix(mas);
//        System.out.println("Строки с четными номерами ");
//        printEvenRow(mas);

//       Matrix17. Дана матрица размера M × N и целое число K (1 ≤ K ≤ M). Найти
//       сумму и произведение элементов K-й строки данной матрицы.
//        fillMatrix(mas, -10, 10);
//        printEvenRow(mas);
//        System.out.println(" Введите номер строки ");
//        Scanner in = new Scanner(System.in);
//        int k = in.nextInt();
//        System.out.println("Сумма элементов " + k + "-ой строки." + sumOfRow(mas, k));

//        Matrix19. Дана матрица размера M × N. Для каждой строки матрицы найти
//        сумму ее элементов.
        fillMatrix(mas,-10,10)        ;
        printMatrix(mas);


        for (int i = 0; i < mas.length; i++) {
            {int sum = 0;

                for (int j = 0; j < mas[i].length; j++) {
                    sum += mas[i][j];
                }System.out.println("Сумма строки " + (i+1) + " = " + sum);
            }

        }






    }// main
}
