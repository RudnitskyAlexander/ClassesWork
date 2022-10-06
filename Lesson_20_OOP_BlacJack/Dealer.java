package Lessons.Lesson_20_OOP_BlacJack;

import java.util.TreeMap;

public class Dealer extends Hand {

    @Override
    public void play(Deck deck) throws InterruptedException
    {
        takeOneCard(deck);
        takeOneCard(deck);
        while (calcScore() < 17) {
            System.out.println("Dealer hand: " + hand + " dealer score: " + calcScore());
            takeOneCard(deck);
            Thread.sleep(2000);
        }
        System.out.println("Dealer hand: " + hand + " dealer score: " + calcScore());
    }

}


