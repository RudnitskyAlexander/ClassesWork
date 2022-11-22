package Lesson_33_Lambda;
// https://javarush.com/groups/posts/lambda-vihrazhenija-v-java-chast-1
// https://javarush.com/groups/posts/845-lambda-vihrazhenija-na-primerakh

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

@FunctionalInterface
interface Sort{
    public int compare(String[] o1, String[] o2);
}

public class Main {
    public static void main(String[] args) {

        String[] arr1 = {"Мама", "мыла", "раму", "м","па"};
        String[] arr2 = {"Наша", "Таня", "громко", "плачет"};
        String[] arr3 = {"Идет", "бычек", "качается"};

        List<String[]> lst = new ArrayList<>();
        lst.add(arr1);
        lst.add(arr2);
        lst.add(arr3);

        Comparator<String[]> sortByLength = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        };

        Comparator<String[]> sortByWordsLenght = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int len1 = 0;
                for (String str : o1) {
                    len1 += str.length();
                }
                int len2 = 0;
                for (String str : o2) {
                    len2 += str.length();
                }
                return len1 - len2;
            }
        };

//        lst.sort(sortByLength);
//        System.out.println(Arrays.deepToString(lst.toArray()));
//
//        lst.sort(sortByWordsLenght);
//        System.out.println(Arrays.deepToString(lst.toArray()));

        lst.sort((String[] o1, String[] o2)->{ return o1.length - o2.length;});
        System.out.println(Arrays.deepToString(lst.toArray()));



    }
}
