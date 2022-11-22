package Lesson_33_Lambda;

public class Car {
    public enum Body {SEDAN, HATCHBACK, UNIVERSAL, CUPE, ROADSTER}

    ;
    Body body;
    int power;

    public Car(Body body, int power) {
        this.body = body;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "body=" + body +
                ", power=" + power +
                '}';
    }


    public Body getBody() {
        return body;
    }

    public int getPower() {
        return power;
    }
}
