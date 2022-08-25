package Lesson_20220825;
// Занятие 25.08.2022 коллекция ArrayList

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.awt.windows.WPrinterJob;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lesson_20220825 {

    static void fillRandom(ArrayList<Integer> mas, int left, int right, int qty) {
        for (int i = 0; i < qty; i++) {
            Random gen = new Random();
            mas.add(gen.nextInt(right - left + 1) + left);
        }
    }

    static void print(ArrayList<Integer> mas) {
        for (int i = 0; i < mas.size(); i++) {
            System.out.print(mas.get(i) + " ");
        }
        System.out.println();
    }

    static int findPosMin(ArrayList<Integer> mass) {
        int posMin = -1;
        if (mass.size() == 0) return posMin;
        int min = mass.get(0);
        for (int i = 0; i < mass.size(); i++) {
            if (mass.get(i) < min) {
                min = mass.get(i);
                posMin = i;
            }
        }
        return posMin;
    }

    static int findPosMax(ArrayList<Integer> mass) {
        int posMax = -1;
        if (mass.size() == 0) return posMax;
        int max = mass.get(0);
        for (int i = 0; i < mass.size(); i++) {
            if (mass.get(i) > max) {
                max = mass.get(i);
                posMax = i;
            }
        }
        return posMax;
    }

    static void swap(ArrayList<Integer> mas, int index1, int index2) {
        int temp = mas.get(index1); // temp =mas[index1];
        mas.set(index1, mas.get(index2)); // mas[index1] = mas[index2];
        mas.set(index2, temp); // mas[index2] = temp;
    }

    // int left 0; int left 9; int qty 10
    static void initDeck(ArrayList<Integer> deck) {
        for (int k = 0; k < 4; k++) {
            for (int i = 1; i < 10; i++) {
                deck.add(i);
            }
            for (int i = 0; i < 4; i++) {
                deck.add(10);
            }
        }
    }

    static void shuffleDeck(ArrayList<Integer> deck) {
        Random gen = new Random();
        for (int k = 0; k < deck.size(); k++) {
            for (int i = 0; i < deck.size(); i++) {
                int randomIndex = gen.nextInt(deck.size());
                swap(deck, i, randomIndex);
            }
        }
    }

    static void fillRandomIntager(ArrayList<Integer> mas, int left, int right, int qty) {
        for (int i = 0; i < qty; i++) {
            Random gen = new Random();
            mas.add(gen.nextInt(right - left + 1) + left);
        }
    }


    static int summArr(ArrayList<Integer> mass) {
        int summ = 0;
        for (int i = 0; i < mass.size(); i++) {
            summ += mass.get(i);
        }
        return summ;
    }

    static int multArr(ArrayList<Integer> mass) {
        int mult = 1;
        for (int i = 0; i < mass.size(); i++) {
            mult += mass.get(i);
        }
        return mult;
    }


    public static void main(String[] args) {
        // System.out.println("Hello World!!!");
//        ArrayList<Integer> arr = new ArrayList<>();
//        fillRandom(arr, -10, 10, 15);
//        print(arr);


// Найти позиции минимального элемента
//        System.out.println(findPosMin(arr) + " ");

// Найти позиции минимального элемента
//        System.out.println(findPosMax(arr) + " ");

//  переписать минимум и максимум местами
//        swap(arr, findPosMin(arr), findPosMax(arr));
//        print(arr);

//      Black-Jack
//        ArrayList<Integer> deck = new ArrayList<>();
//        initDeck(deck);
//        print(deck);
//        shuffleDeck(deck);
//        print(deck);

//Series1◦ Даны десять вещественных чисел. Найти их сумму.

//        ArrayList<Integer> arr = new ArrayList<>();
//        fillRandomIntager(arr, -10, 10, 10);
//        print(arr);
//        System.out.println(summArr(arr));

//Series2. Даны десять вещественных чисел. Найти их произведение.
//
//        ArrayList<Integer> arr = new ArrayList<>();
//        fillRandomIntager(arr, -10, 10, 10);
//        print(arr);
//        System.out.println(multArr(arr));


//Series3. Даны десять вещественных чисел. Найти их среднее арифметическое.
//        ArrayList<Integer> arr = new ArrayList<>();
//        fillRandomIntager(arr, -10, 10, 10);
//        print(arr);
//        System.out.println(summArr(arr));
//        System.out.println((double)(summArr(arr))/10);

//Series4. Дано целое число N и набор из N вещественных чисел. Вывести
//        сумму и произведение чисел из данного набора.
        ArrayList<Integer> arr = new ArrayList<>();
        fillRandomIntager(arr, -10, 10, 10);
        print(arr);
        System.out.println(summArr(arr));
        System.out.println(multArr(arr));


    } // main
} // class
