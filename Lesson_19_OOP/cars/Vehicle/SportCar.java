package Lesson_19_OOP.cars.Vehicle;

import Lesson_19_OOP.cars.Engine;
import Lesson_19_OOP.cars.Profession.Driver;

public class SportCar extends Car {
    int speed;

    public SportCar() {
    }

       public SportCar(String carClass, String brand, Engine engine, Driver driver, int speed) {
        super(carClass, brand, engine, driver);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "carClass='" + carClass + '\'' +
                ", brand='" + brand + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", speed=" + speed +
                '}';
    }
}
