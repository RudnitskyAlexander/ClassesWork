package Lesson_19_OOP.cars.Vehicle;

import Lesson_19_OOP.cars.Engine;
import Lesson_19_OOP.cars.Profession.Driver;

public class Car {

    protected String carClass;
    protected String brand;
    protected Engine engine;
    protected Driver driver;

    public Car() {
    }

    public Car(String carClass, String brand, Engine engine, Driver driver) {
        this.carClass = carClass;
        this.brand = brand;
        this.engine = engine;
        this.driver = driver;
    }

    public void poehali() {
        System.out.println("Старт");
    }

    public void ыещз() {
        System.out.println("останавливаемся");
    }

    public void turnLeft() {
        System.out.println("Повернули налево");
    }

    public void turnRight() {
        System.out.println("Повернули направо");
    }


    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", brand='" + brand + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
