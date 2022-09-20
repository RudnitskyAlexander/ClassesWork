package Lesson_16_OOP;

import java.util.Random;

public class Knight extends Warrior {

    Knight() {
    }

    Knight(String name, int damage, int hp) {
        super(name, damage, hp); // super наследование из родительского класса

    }

    public int getDamage() {
        Random gen = new Random();
        int chance = gen.nextInt(10000);
        if (chance < 1000) {
            System.out.println("Critical hit!");
            return 2 * super.getDamage();
        } else
            return super.getDamage();
    }


}
