package Lesson_36;

import java.io.Serializable;

public class Fish implements Serializable {
    private String name;
    private int weight;
    private double price;

    public Fish() {
        this.name = "";
        this.weight = 0;
        this.price = 0.0;
    }

    public Fish(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
