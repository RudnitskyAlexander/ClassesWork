package Lesson_19_OOP.cars.Profession;

import Lesson_19_OOP.cars.Profession.Person;

public class Driver extends Person {
    private int epx;

    Driver() {
    }

    public Driver(String fullName, int age, int epx) {
        super(fullName, age);
        this.epx = epx;
    }

    public int getEpx() {
        return epx;
    }

    public void setEpx(int epx) {
        this.epx = epx;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "epx=" + epx +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}



