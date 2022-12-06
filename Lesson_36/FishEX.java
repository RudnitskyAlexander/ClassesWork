package Lesson_36;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class FishEX implements Externalizable {
    private String name;
    private int weight;
    private double price;

    public FishEX() {
        this.name = "";
        this.weight = 0;
        this.price = 0.0;
    }

    public FishEX(String name, int weight, double price) {
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
        return "FishEX{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';

    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeInt(price);
        out.writeDouble(weight);
    }



    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        weight = in.readInt();
        price = in.readDouble();

    }}
