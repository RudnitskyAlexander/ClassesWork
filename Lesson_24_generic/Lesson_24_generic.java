package com.company.Lesson_24_generic;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Lesson_24_generic {
    public static void main(String[] args) {
//        // без дженерика
//        List listAnimal = new ArrayList();
//        listAnimal.add("cat");
//        listAnimal.add("dog");
//        listAnimal.add("horse");
//        String firstAnimal = (String) listAnimal.get(0);
//        System.out.println(firstAnimal);
//
//        // с дженериком
//        List<String> listAnimal1 = new ArrayList<>();
//        listAnimal1.add("cat1");
//        listAnimal1.add("dog1");
//        listAnimal1.add("horse1");
//        String firstAnimal1 = listAnimal1.get(0);
//        System.out.println(firstAnimal1);

        Mage mage = new Mage();
        mage.cast();
        mage.hit();
        mage.move();

    }
}


//ходить
interface canMove {
    void move();
}

//бить
interface canHit {
    void hit();
}

//колдовать
interface canCast {
    void cast();
}
//летать

//стрелять


//маг - ходить, бить, колдовать
class Mage implements canMove, canHit, canCast {
    @Override
    public void move() {
        System.out.println("Mage is moving");
    }

    @Override
    public void hit() {
        System.out.println("Mage is hitting");
    }

    @Override
    public void cast() {
        System.out.println("Mage is casting");
    }
}

