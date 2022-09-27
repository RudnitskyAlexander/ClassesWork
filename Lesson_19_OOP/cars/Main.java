package Lesson_19_OOP.cars;


// 6. Автомобили https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
//       1- Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver в пакете com.company.professions.
//       2- Класс Driver содержит поля - ФИО, стаж вождения.
//       3- Класс Engine содержит поля - мощность, производитель.
//       4- Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver,
//          мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать:
//          "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево". А также метод toString(),
//          который выводит полную информацию об автомобиле, ее водителе и моторе.
//       5- Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
//       6- Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
//       7- Пусть класс Driver расширяет класс Person. Решение
//

import Lesson_19_OOP.cars.Profession.Driver;
import Lesson_19_OOP.cars.Vehicle.Car;

public class Main {

    public static void main(String[] args) {

        Engine e1 = new Engine(150, "BMW");
        Driver d1 = new Driver("Ivan Ivanov", 40, 15);
        Car c1 = new Car("lorry", "Volvo", e1, d1);

        System.out.println(e1);
        System.out.println(d1);
        System.out.println(c1);
    }


}
