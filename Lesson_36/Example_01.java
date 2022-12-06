package Lesson_36;

import java.io.*;

public class Example_01 {
    public static void writeObject(Object obj, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readObject(String fileName) {

        try (FileInputStream fos = new FileOutputStream(fileName);
             Object obj = null;
             ObjectInputStream ois = new ObjectInputStream(fos)) {
            Object obj = ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeObjectEx(FishEX obj, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeExternal(obj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Fish salmon = new Fish("salmon", 1000, 39.99);
        writeObject(salmon, "fish.txt");
        Fish newFish = (Fish) readObject("fish.txt");
        System.out.println(newFish);

        FishEX shark = new FishEX("shark", 500);
        writeObjectEx(shark, "fishex.txt");
        FishEX newFishEx = readObjectEx("fishex.txt");
        System.out.println();
    }
}



