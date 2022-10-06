package Lesson_22_String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // String1. Дан символ C. Вывести его код (то есть номер в кодовой таблице).

//        Scanner in = new Scanner(System.in);
//        char c;
//        // c = in.nextLine().charAt(0);
//        c='\u00AE';
//        System.out.println(c);
//        System.out.println((int)c);

        // String4. Дано целое число N (1 ≤ N ≤ 26). Вывести N первых прописных (то
//        есть заглавных) букв латинского алфавита.
//        for (int i = 'A'; i <= 'Z'; i++) {
//            System.out.print((char)i + " ");
//        }

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int c = 'A'+(n-1); c <= 'Z'; c++) {
//            System.out.print((char)c + " ");
//        }
        // task 1 дана строка из строчных букв (маленькие). Перевести в прописные (большие).

//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        int offSet = 'a' - 'A';
//        StringBuilder buf = new StringBuilder(str);
//        for (int i = 0; i < buf.length(); i++) {
//            int c = (int) buf.charAt(i) - offSet;
//            buf.setCharAt(i, (char) c);
//        }
//
//        System.out.println(buf);

//        вводится предложение без знаков препинания на английском языке.
//        Слова в предложении разделяются ровно одним пробелом
//        написать статаческий метод, который сделает первые буквы большими.

//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        System.out.println(changeReg(str));
//        System.out.println(changeReg2(str));

//        String13. Дана строка. Подсчитать количество содержащихся в ней цифр.

//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        System.out.println(taskString13(str));

//      String14. Дана строка. Подсчитать количество содержащихся в ней прописных
//      латинских букв.

//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        System.out.println(latinLetterUpper14(str));

//        String15. Дана строка. Подсчитать общее количество содержащихся в ней
//        строчных латинских и русских букв.

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(latinCyrilykLetterSumm15(str));

        //       String16. Дана строка. Преобразовать в ней все прописные латинские буквы в
        //       строчные

    }

    //for task 1
    public static String changeReg(String str) {
        int offSet = 'a' - 'A';
        StringBuilder buf = new StringBuilder(str);
        for (int i = 0; i < buf.length(); i++) {
            if (buf.charAt(i) == ' ') {
                int c = (int) buf.charAt(i + 1) - offSet;
                buf.setCharAt(i + 1, (char) c);
            }
        }
        if ('a' <= buf.charAt(0) && buf.charAt(0) <= 'z') {
            //int c = buf.charAt(0) - offSet;
            // buf.setCharAt(0, (char) c);
            charLowerToUpper(buf, 0);
        }
        return buf.toString();
    }

    public static void charLowerToUpper(StringBuilder buf, int i) {
        int offSet = 'a' - 'A';
        int c = buf.charAt(i) - offSet;
        buf.setCharAt(i, (char) c);
    }

    public static String changeReg2(String str) {
        int offSet = 'a' - 'A';
        StringBuilder buf = new StringBuilder(str);
        for (int i = 1; i < buf.length(); i++) {
            if (buf.charAt(i) != ' ' && buf.charAt(i - 1) == ' ') {
                // isLetter(buf, i) && isLowerCase(buf, i) && isSpace(buf, i-1)
                charLowerToUpper(buf, i);
            }
        }
        if ('a' <= buf.charAt(0) && buf.charAt(0) <= 'z') {
            charLowerToUpper(buf, 0);
        }
        return buf.toString();
    }

    //    public static boolean isLetter(String buf, int i){
//
//    }
    public static boolean isDigit(String str, int i) {
        return '0' <= str.charAt(i) && str.charAt(i) <= '9';
    }

    public static int taskString13(String str) {
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            {
                if (isDigit(str, i))
                    k++;
            }
        }
        return k;
    }

    public static int latinLetterUpper14(String str) {
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            {
                if (isLatinUpper(str, i))
                    k++;
            }
        }
        return k;
    }

    public static boolean isLatinUpper(String str, int i) {
        return 'A' <= str.charAt(i) && str.charAt(i) <= 'Z';
    }

    public static int latinCyrilykLetterSumm15(String str) {
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            {
                if (isLatinAndCyrilyk(str, i))
                    k++;
            }
        }
        return k;
    }

    public static boolean isLatinAndCyrilyk(String str, int i) {
        return 'a' <= str.charAt(i) && str.charAt(i) <= 'z' || 'а' <= str.charAt(i) && str.charAt(i) <= 'я';
    }


}