package Lesson_19_OOP;

public class Main {
    public static void main(String[] args) {

//    https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
//    5. Наследование Student, Aspirant
//    Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
//    Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
//    Создать переменную типа Student, которая ссылается на объект типа Aspirant.
//    Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
//    Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.
//    Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
//    Создать массив типа Student, содержащий объекты класса Student и Aspirant.
//    Вызвать метод getScholarship() для каждого элемента массива.
//    Смотрите решение задачи в видео 1, видео 2.


        final int size = 2;
        Student[] mas = new Student[size];
        Student s1 = new Student("Ivan", "Ivanov", 2121, 4.5);
        Aspirant a1 = new Aspirant("Petr", "Petrov", 21, 5.0);

        mas[0] = s1;
        mas[1] = a1;
        Student q1 = new Aspirant("Igor", "Buchukov", 22, 4.0);
        System.out.println(q1.getScholarship());

        for (Student stud : mas) {
            System.out.print(stud);
            System.out.println(" grant= " + stud.getScholarship());
        }


    }
}
