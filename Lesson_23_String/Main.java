package Lesson_23_String;
// https://www.examclouds.com/ru/java/java-core-russian/lesson12-tasks

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {

////        Строки. Задания
////        1. Практика методов класса String
////        Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
//        String str = "I like Java!!!";
////        Распечатать последний символ строки. Используем метод String.charAt().
//        System.out.println(str.charAt(str.length() - 1));
////        Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//        System.out.println(str.endsWith("!!!"));
////        Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
//        System.out.println(str.startsWith("I like"));
////        Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//        System.out.println(str.contains("Java"));
////        Найти позицию подстроки “Java” в строке “I like Java!!!”.
//        System.out.println(str.indexOf("Java", 0));
////        Заменить все символы “а” на “о”.
//      System.out.println(str.replace("a","o"));
////        Преобразуйте строку к верхнему регистру.
//       System.out.println(str.toLowerCase(Locale.ENGLISH));
////                Преобразуйте строку к нижнему регистру.
//        System.out.println(str.toUpperCase(Locale.ENGLISH));
////        Вырезать строку Java c помощью метода String.substring().
//        System.out.println(str.substring
//                (str.indexOf("I like"), str.indexOf("I like") + "I like".length()));

//        2. Составляем строку с помощью класса StringBuilder
//        Дано два числа, например 3 и 56, необходимо составить следующие строки:
//        Integer x;
//        Integer y;
//        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//        String str = buf.readLine();
//        x = Integer.parseInt(str);
//        str = buf.readLine();
//        y = Integer.parseInt(str);
////        3 + 56 = 59
////        Используем метод StringBuilder.append().
//        Integer res = x + y;
//        StringBuilder sb = new StringBuilder(x.toString());
//        sb.append(" + ");
//        sb.append(y.toString());
//        sb.append(" = ");
//        sb.append(res.toString());
//        System.out.println(sb);
////        3 – 56 = -53
//        Integer res1 = x - y;
//        StringBuilder sb1 = new StringBuilder(x.toString());
//        sb1.append(" - ");
//        sb1.append(y.toString());
//        sb1.append(" = ");
//        sb1.append(res1.toString());
//        System.out.println(sb1);
////        3 * 56 = 168.
//        Integer res2 = x * y;
//        StringBuilder sb2 = new StringBuilder(x.toString());
//        sb2.append(" * ");
//        sb2.append(y.toString());
//        sb2.append(" = ");
//        sb2.append(res2.toString());
//        System.out.println(sb2);
////        Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
//        int pos = sb2.indexOf("=");
//        sb2.deleteCharAt(pos);
//        sb2.insert(pos, " is ");
//        System.out.println(sb2);
////        Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//        int pos1 = sb.indexOf("=");
//        sb.replace(pos1, pos1 + 1, " is ");
//        System.out.println(sb);

//        3. Заменить каждое второе вхождение строки
//        Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming» (не учитываем регистр символов) на «OOP».
//        Например, строка
//        "Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic.
//        Object-oriented programming blabla. Object-oriented programming bla."
//        должна быть преобразована в
//        "Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic.
//        OOP blabla. Object-oriented programming bla."


        String text = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic." +
                " Object-oriented programming blabla. Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic.Object-oriented programming blabla.";
        System.out.println(changeOop(text));
        System.out.println(" ");


    }

    public static String changeOop(String text) {
        StringBuilder newText = new StringBuilder(text);
        String oop = "Object-oriented programming";
        int ooplenght = oop.length();
        int positionOop = newText.indexOf("Object-oriented programming");
        boolean check = false;
        if (check == false) {
            newText.replace(positionOop, ooplenght, "OOP");
            positionOop = newText.indexOf("Object-oriented programming");
            String text1 = newText.toString();
            check = text1.contains("Object-oriented programming");

        }
        String testText = newText.toString();
        return testText;
    }

}
