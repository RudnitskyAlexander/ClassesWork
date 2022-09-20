package Lesson_16_OOP;

public class Main {
    public static void main(String[] args) {
//        Fraction f1 = new Fraction();
//        f1.print();
//        f1.setNom(1);
//        f1.setNom(2);
//        f1.print();
//
//        Fraction f2 = new Fraction(1, 2);
//        f2.print();
//
//        Fraction f3 = f1.mul(f2);
//        f3.print();
//
//        Fraction f4 = f1.div(f2);
//        f4.print();

        Knight k1 = new Knight("Ilya Muromets", 10, 50);
        System.out.println(k1);

        Paladin p1 = new Paladin("Dobrinia Nikitich", 10, 50);
        System.out.println(p1);

        while (p1.isAlive() && k1.isAlive()) {
            System.out.println(k1.getName() + " hit " + p1.getName());
            p1.takeHit(k1);
            System.out.println(p1);

            System.out.println(p1.getName() + " hit " + k1.getName());
            p1.takeHit(p1);
            System.out.println(k1);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (k1.isAlive())
            System.out.println(k1.getName() + " win! ");
        else System.out.println(p1.getDamage() + " win! ");
    }
}
