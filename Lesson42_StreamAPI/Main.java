package Lesson42_StreamAPI;

import jdk.nashorn.api.tree.SimpleTreeVisitorES5_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


//        List<Log> logList = List.of(
//                new Log("Береза", 10),
//                new Log("Дуб монгольский", 7),
//                new Log("Дуб европейский", 3),
//                new Log("Сосна", 5)
//        );
//
//        Stream<Log> logStream = logList.stream();
//        Stream<Log> filtered = logStream.filter(x -> x.getType().contains("Дуб")).
//                filter(x->x.getCount()>5);
//        filtered.forEach(x -> System.out.println(x));

        List<Student> studentList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int choice;
        for (int i = 0; i < 10; i++) {
            Student stud = new Student();
            choice = gen.nextInt(2);
            if (choice == 1) stud.setSex('m');
            else stud.setSex('f');
            stud.setAge(gen.nextInt(51) + 15);

            int[] newMarks = new int[4];
            for (int j = 0; j < newMarks.length; j++) {
                newMarks[j] = gen.nextInt(10) + 1;
            }
            stud.setMarks(newMarks);
            stud.setAvg();
            studentList.add(stud);
        }

        //System.out.println(studentList.toString());


       // studentList.stream().filter(x -> x.getAvg() > 5.0).forEach(System.out::println);

        System.out.println(studentList.stream().map(x -> x.getAvg()).reduce(0.0, (x, y) -> x + y) / 10);
        double sum=0.0;
        for (Student stud1: studentList) {
            sum+=stud1.getAvg();
                    }
        System.out.println(sum/10);


    }
}
