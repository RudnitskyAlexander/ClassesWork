package com.company;

import java.util.Scanner;

//Оператор выбора
public class Main {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the three symbol number:");
//        int a = in.nextInt();
//        boolean res = (a % 2 != 0) && (a < 1000);
//        System.out.println("Result is: " + res);

//        Case1. Дано целое число в диапазоне 1–7. Вывести строку — название дня
//        недели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).

//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the day of week:");
//        int day = in.nextInt();
//        if (day == 1) {
//            System.out.println("Понедельник ");
//        }
//            else if (day == 2) {
//            System.out.println("Вторник ");
//        }
//    else if (day == 3) {
//            System.out.println("Среда ");
//        }
//    else if (day == 4) {
//            System.out.println("Четверг ");
//        }
//    else if (day == 5) {
//            System.out.println("Пятница ");
//        }
//    else if (day == 6) {
//            System.out.println("Суббота ");
//        }
//    else if (day == 7) {
//            System.out.println("Воскресенье ");
//        } else{
//            System.out.println("Нет такого дня ");
//        } ;

//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the day of week:");
//        int day = in.nextInt();
//
//        switch (day) {
//            case 1:
//                System.out.println("Понедельник ");
//                break;
//            case 2:
//                System.out.println("Вторник ");
//                break;
//            case 3:
//                System.out.println("Среда ");
//                break;
//            case 4:
//                System.out.println("Четверг ");
//                break;
//            case 5:
//                System.out.println("Пятница ");
//                break;
//            case 6:
//                System.out.println("Суббота ");
//                break;
//            case 7:
//                System.out.println("Воскресенье ");
//                break;
//            default:
//                System.out.println("Нет такого дня ");
//        }
//
//        Case2.Дано целое число K.Вывести строку -описание оценки, соответствующей числу
//        K(1 — «плохо», 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»).
//                Если K не лежит в диапазоне 1–5, то вывести строку «ошибка».

//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the number:");
//        int k = in.nextInt();
//
//        switch (k) {
//            case 1:
//                System.out.println("плохо ");
//                break;
//            case 2:
//                System.out.println("неудовлетворительно ");
//                break;
//            case 3:
//                System.out.println("удовлетворительно ");
//                break;
//            case 4:
//                System.out.println("хорошо ");
//                break;
//            case 5:
//                System.out.println("отлично ");
//                break;
//            default:
//                System.out.println("ошибка ");
//        }
//        Case3.Дан номер месяца —целое число в диапазоне 1–12 (1 —январь, 2 —февраль и т.д.).Вывести название
//        соответствующего времени года(«зима»,  «весна», «лето», «осень»).

        /*Scanner in = new Scanner(System.in);
        System.out.print("Inter the number:");
        int num = in.nextInt();

        switch (num) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень ");
                break;
            default:
                System.out.println("ошибка ");
        }
        Case4◦ . Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —
       февраль и т. д.). Определить количество дней в этом месяце для невисокосного года.*/

//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the number:");
//        int num = in.nextInt();
//
//        switch (num) {
//            case 1:
//            case 2:
//            case 12:
//                System.out.println("Зима ");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Весна ");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Лето ");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Осень ");
//                break;
//            default:
//                System.out.println("ошибка ");
//        }
//        Case15. Мастям игральных карт присвоены порядковые номера: 1 — пики,
//        2 — трефы, 3 — бубны, 4 — червы. Достоинству карт, старших десятки,
//        присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз. Даны
//        два целых числа: N — достоинство (6 ≤ N ≤ 14) и M — масть карты
//        (1 ≤ M ≤ 4). Вывести название соответствующей карты вида «шестерка
//        бубен», «дама червей», «туз треф» и т. п

//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the number M:");
//        int mast = in.nextInt();
//        System.out.print("Inter the number N:");
//        int val = in.nextInt();
//
//        switch (mast) {
//            case 1:
//                System.out.print("пики ");
//                break;
//            case 2:
//                System.out.print("трефы ");
//                break;
//            case 3:
//                System.out.print("бубны ");
//                break;
//            case 4:
//                System.out.print("червы ");
//                break;
//            default:
//                System.out.print("ошибка ");
//        }
//
//        switch (val) {
//            case 6:
//                System.out.print("6 ");
//                break;
//            case 7:
//                System.out.print("7 ");
//                break;
//            case 8:
//                System.out.print("8 ");
//                break;
//            case 9:
//                System.out.print("9 ");
//                break;
//            case 10:
//                System.out.print("10 ");
//                break;
//            case 11:
//                System.out.print("валет ");
//                break;
//            case 12:
//                System.out.println("дама ");
//                break;
//            case 13:
//                System.out.print("король ");
//                break;
//            case 14:
//                System.out.print("туз ");
//                break;
//
//            default:
//                System.out.print("ошибка ");
//        }
//        Циклы
//        For1. Даны целые числа K(111) и N (5) (N > 0). Вывести K раз число N.

//        for (int i=1; i<=10; i=i+1){
//            System.out.println(i+" ");
//        }

//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the number K:");
//        int k = in.nextInt();
//        System.out.print("Inter the number N:");
//        int n = in.nextInt();
//
//        for (int i=1; i<=n; i=i+1){
//           System.out.print(k+" ");
//       }
//
//        For2. Даны два целых числа A и B (A < B). Вывести в порядке возрастания все
//        целые числа, расположенные между A и B (включая сами числа A и B), а
//        также количество N этих чисел.
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the number A:");
//        int a = in.nextInt();
//        System.out.print("Inter the number B:");
//        int b = in.nextInt();
//        int result = 0;
//
//        for (int i = a; i <= b; i = i + 1) {
//            System.out.print(i + " ");
//            result = result + 1; //result +=1;
//        }
//        System.out.println(" n= " + result);

//        For3. Даны два целых числа A и B (A < B). Вывести в порядке убывания все
//        целые числа, расположенные между A и B (не включая числа A и B), а
//        также количество N этих чисел
//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the number A:");
//        int a = in.nextInt();
//        System.out.print("Inter the number B:");
//        int b = in.nextInt();
//        int result = 0;
//
//        for (int i = b-1; i >a; i = i - 1) {
//            System.out.print(i + " ");
//            result++;
//        }
//
//        System.out.println(" n= " + result);
//
//        For4. Дано вещественное число — цена 1 кг конфет.
//        Вывести стоимость 1, 2, . . . , 10 кг конфет.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the number A:");
//        double price = in.nextDouble();
//
//        for (int weight = 1; weight < 11; weight = weight + 1) {
//            System.out.println("Цена " + weight + " кг. конфет равна " + weight * price + " рублей");
//        }
//        For5◦. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1,
//                0.2, . . . , 1 кг конфет

//        Scanner in = new Scanner(System.in);
//        System.out.print("Inter the number A:");
//        double price = in.nextDouble();
//
//        for (double weight = 0.1; weight < 1.01; weight = weight + 0.1) {
//            System.out.println("Цена " + Math.round(weight*10)/10.0 + " кг. конфет равна " + Math.round(weight * price*100)/100.0 + " рублей");
//        }
//
//        For6. Дано вещественное число — цена 1 кг конфет.
//        Вывести стоимость 1.2, 1.4, . . . , 2 кг конфет
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите стоимость конфер руб/кг:");
//        double price = in.nextDouble();
//
//        for (double weight = 1.2; weight < 2.01; weight = weight + 0.2) {
//            System.out.println("Цена " + Math.round(weight*10)/10.0 + " кг. конфет равна " + Math.round(weight * price*100)/100.0 + " рублей");
//        }
//      For7. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел
//          от A до B включительно

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число A:");
//        int a = in.nextInt();
//        System.out.print("Введите число B:");
//        int b = in.nextInt();
//        int sum = 0;
//
//        for (int i = a; i <= b; i = i + 1) {
//            sum = sum + i;
//        }
//        System.out.println("Сумма всех чисел между " + a + " и " + b + " равна " +sum);


//        For8. Даны два целых числа A и B (A < B). Найти произведение всех целых
//        чисел от A до B включительно

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число A:");
//        int a = in.nextInt();
//        System.out.print("Введите число B:");
//        int b = in.nextInt();
//        int mult = 1;
//
//        for (int i = a; i <= b; i = i + 1) {
////            mult = mult*i;
//        }
//        System.out.println("Произведение всех чисел между " + a + " и " + b + " равна " +mult);
//
//        For9. Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых
//        чисел от A до B включительно.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число A:");
//        int a = in.nextInt();
//        System.out.print("Введите число B:");
//        int b = in.nextInt();
//        int sum = 0;
//
//        for (int i = a; i <= b; i = i + 1) {
//            sum = sum + i * i;
//        }
//        System.out.println("Сумма квадратов всех чисел между " + a + " и " + b + " равна " + sum);
//
//        For10. Дано целое число N (> 0).
//        Найти сумму 1 + 1/2 + 1/3 + . . . + 1/N  (вещественное число).

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число N:");
//        int n = in.nextInt();
//        double sum = 0;
//
//        for (int i = 1; i <= n; i = i + 1) {
//            sum = sum + 1.0 / i;
//        }
//        System.out.println("Сумма  чисел   равна " + sum);

//        For11. Дано целое число N (> 0). Найти сумму
//        N^2 + (N + 1)^2 + (N + 2)^2 + . . . + (2·N)^2
//        (N+0)^2 + (N + 1)^2 + (N + 2)^2 + . . . + (N+N)^2
//        Math.pow(n+i,2) -> double
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число N:");
//        int n = in.nextInt();
//        int sum = 0;
//
//        for (int i = 0; i <= n; i = i + 1) {
//            sum = sum + (n + i) * (n + i);
//        }
//        System.out.println("Сумма  чисел   равна " + sum);
//
//        Series1◦. Даны десять вещественных чисел. Найти их сумму.

//        Scanner in = new Scanner(System.in);
//        double sum = 0;
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.print("Введите число N" + i + " :");
//            double n = in.nextDouble();
//            sum = sum + n;
//        }
//        System.out.println("Сумма  чисел   равна " + sum);
//
//        Series2. Даны десять вещественных чисел. Найти их произведение.

//        Scanner in = new Scanner(System.in);
//        double mult = 1;
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.print("Введите число N" + i + " :");
//            double n = in.nextDouble();
//            mult = mult * n;
//        }
//        System.out.println("Произведение  чисел   равна " + mult);
//
//        Series3. Даны десять вещественных чисел. Найти их среднее арифметическое
//        Scanner in = new Scanner(System.in);
//        double sum = 0;
//        int i;
//        for (i = 1; i <= 5; i++) {
//            System.out.print("Введите число N" + i + " :");
//            double n = in.nextDouble();
//            sum = sum + n;
//        }
//        System.out.println("Сумма  чисел   равна " + sum / i);
//
//        Series4. Дано целое число N и набор из N вещественных чисел. Вывести
//        сумму и произведение чисел из данного набора.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число N:");
//        int n = in.nextInt();
//        double sum = 0;
//        double mult = 1;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Введите число N" + i + " :");
//            double m = in.nextDouble();
//            sum = sum + m;
//            mult = mult * m;
//        }
//        System.out.println("Сумма  чисел   равна " + sum);
//        System.out.println("Произведение чисел равна " + mult);
//
//        Series5. Дано целое число N и набор из N положительных вещественных
//        чисел. Вывести в том же порядке целые части всех чисел из данного
//        набора (как вещественные числа с нулевой дробной частью), а также
//        сумму всех целых частей.

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число N:");
//        int n = in.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Введите число N" + i + " :");
//            double m = in.nextDouble();
//            System.out.println("Целая часть числа N : " + (int) m);
//            sum = sum + (int) m;
//        }
//        System.out.println("Сумма  чисел   равна " + sum);
//
//        Series6. Дано целое число N и набор из N положительных вещественных
//        чисел. Вывести в том же порядке дробные части всех чисел из данного набора (как вещественные числа с нулевой целой частью), а также
//        произведение всех дробных частей.

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число N:");
        int n = in.nextInt();
        double mult = 0;
        double res = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Введите число N" + i + " :");
            double m = in.nextDouble();
            res = m - (int) m;
            System.out.println("Целая часть числа N : " + res);
            mult = mult * +(m - (int) m);
        }
        System.out.println("Произведение  чисел   равна " + mult);


    }
}
