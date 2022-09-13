// занятие 13.09.2022


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_15 {
    static void fillMatrix(int[][] fmas) {
        Random gen = new Random();
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                fmas[i][j] = gen.nextInt(10);
            }

        }
    }

    static void task20(int[][] fmas) {
        for (int k = 0; k < fmas[0].length; k++) {
            int p = 1;
            for (int i = 0; i < fmas.length; i++) {
                p *= fmas[i][k];
            }
            System.out.println("Произведение столбца матрицы " + k + " = " + p);
        }
    }

    static int taskL1(int[][] fmas) {
        int sum = 0;
        for (int a = 0; a < fmas.length; a++) {
            sum += fmas[a][a];
        }
        return sum;
    }

    static void initField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = ' ';
            }
        }
    }

    static void printLineSeparator() {
        for (int k = 0; k < 3; k++) {
            System.out.print("|---");
        }
        System.out.println("|");
    }


    static void printField(char[][] field) {
// повторили для всех строк
        for (int i = 0; i < field.length; i++) {
            // напечатали строку-разделитель поля
            printLineSeparator();
            // вывели одну строку
            for (int j = 0; j < field[i].length; j++) {
                System.out.print("| " + field[i][j] + " ");
            }
            System.out.println("|");
        }
        printLineSeparator();
    }

    static void turn(char[][] field, char symbol) {
        Scanner in = new Scanner(System.in);
        int row = 0;
        int column = 0;
        do {
            System.out.println("Введите номер строки ");
            row = in.nextInt();
            System.out.println("Введите номер столбца ");
            column = in.nextInt();
        } while (row < 0 || row > 2 || column < 0 || column > 2 || field[row][column] != ' ');
        // coordinatesInvalid
        field[row][column] = symbol;
    }

    static boolean checkWin(char[][] field, char symbol) {
        boolean result = false;
//        если в любой строке три одинаковых символа
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][2] == symbol)
                result = true;
            break;
        }
//        если в любом столбце три одинаковых символа
        for (int j = 0; j < field.length; j++) {
            if (field[0][j] == field[1][j] && field[1][j] == field[2][j] && field[0][j] == symbol)
                result = true;
            break;
        }
//        если на главной диагонали три одинаковых символа
        if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[1][1] == symbol)
            result = true;
//        если на побочной диагонали три одинаковых символа
        else if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2][0] == symbol)
            result = true;

        return result;
    }

    static boolean checkDraw(char[][] field) {
        boolean result = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == ' ') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {

//        Matrix20.Дана матрица размера M ×N.Для каждого столбца матрицы найти
//        произведение его элементов.

//        final int n = 4;
//        final int m = 5;
//        int[][] mas = new int[n][m];

//        fillMatrix(mas);
//        System.out.println(Arrays.deepToString(mas));
//        task20(mas);

//        for (int j = 0; j < mas.length; j++) {
//            {
//                int mult = 1;
//                for (int i = 0; i < mas[j].length; i++) {
//                    mult*=mas[i][j];
//                }
//                System.out.println("Произведение столбца матрицы "+ j+" = "+mult);
//            }
//
//        }


//        Matrix21.Дана матрица размера M ×N.Для каждой строки матрицы с нечетным номером(1, 3,. . .)найти среднее
//        арифметическое ее элементов. Условный оператор не использовать.

// найти сумму элементов главной диагонали матрицы
//        fillMatrix(mas);
//        System.out.println(Arrays.deepToString(mas));
//
//        System.out.println(taskL1(mas));


        // крестики-нолики
        final char synbolX = 'X';
        final char synbolO = 'O';
        final int size = 3;
        char[][] field = new char[size][size];
// сделать пустое поле. заполнить его пробелами
        initField(field);
        printField(field);
//    игровой цикл
        while (true) {
//    ход крестиков
            turn(field, synbolX);
            // вывести поле
            printField(field);
// запросить куда ставить крестик
//    если координаты правильные - записать в поле
//    вывести поле
//    победа крестиков - конец игры - прервать цикл
            if (checkWin(field, synbolX)) {
                System.out.println("Выиграли крестики");
                break;
            }
//    ничья - конец игры - прервать цикл
if(checkDraw(field)){
    System.out.println("Ничья");
    break;
}
//    ход ноликов
            turn(field, synbolO);
//    победа ноликов - конец игры - прервать цикл
            if (checkWin(field, synbolO)) {
                System.out.println("Выиграли нолики");
                break;
            }
//    ничья - конец игры - прервать цикл

        }

    }// main


}
