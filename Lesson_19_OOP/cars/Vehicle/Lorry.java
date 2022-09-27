package Lesson_19_OOP.cars.Vehicle;

import com.sun.deploy.security.ruleset.BlockRule;

public class Lorry extends Car {
    int carrying;

    public Lorry() {
    }

    public Lorry(int carrying) {
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carClass='" + carClass + '\'' +
                ", brand='" + brand + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", carrying=" + carrying +
                '}';
    }
}
