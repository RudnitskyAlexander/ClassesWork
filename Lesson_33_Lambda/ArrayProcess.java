package Lesson_33_Lambda;

import java.util.function.Predicate;

public class ArrayProcess {
    public static int arrayProcess(int[] arr, Predicate<Integer> predicate) {
        int sum = 0;
        for (Integer elem : arr) {
            if (predicate.test(elem)) {
                sum += elem;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(arrayProcess(arr, x -> x % 2 == 0));
        System.out.println(arrayProcess(arr, x -> x % 2 != 0));
        int a=1;
        int b=4;
        System.out.println(arrayProcess(arr, x -> x>=a && x<=b));
        System.out.println(arrayProcess(arr, x -> x>=a && x<=b));
    }
}
