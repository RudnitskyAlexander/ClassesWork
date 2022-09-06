package com.company;

import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class BlackJack {

    static void createDeck(ArrayList<Integer> fdeck) {
        for (int k = 0; k < 4; k++) {
            for (int i = 1; i <= 9; i++) {
                fdeck.add(i);
            }
            for (int i = 0; i < 4; i++) {
                fdeck.add(10);
            }
        }
    }

    static void shuffleDeck(ArrayList<Integer> fdeck) {
        Random gen = new Random();
        for (int i = 0; i < fdeck.size() - 1; i++) {
            int randomIndex = gen.nextInt(fdeck.size() - (i + 1)) + (i + 1);
            int temp = fdeck.get(i);
            fdeck.set(i, fdeck.get(randomIndex));
            fdeck.set(randomIndex, temp);
        }
    }

    static void playerTurn(ArrayList<Integer> fdeck, ArrayList<Integer> fplayer) {
        // игрок по желанию берет карты из колоды.
        Scanner in = new Scanner(System.in);
        int answer;
        do {
            playerTakeOneCard(fdeck, fplayer);
            int playerScore = calcScore(fplayer);
            System.out.println("У вас " + playerScore + " очков");
            if (playerScore >= 21) break;
            else {
                System.out.println("Хотите взять ещё одну карту? 1- да, любая другая цифра - нет ");
                answer = in.nextInt();
            }
        }
        while (answer == 1);
    }

    static void dealerTurn(ArrayList<Integer> fdeck, ArrayList<Integer> fdealer) {
        int dealerScore = calcScore(fdealer);
        while (dealerScore <= 17) {
            dealerTakeOneCard(fdeck, fdealer);
            System.out.println("У дилера " + dealerScore + " очков");
        }
    }


    static void playerTakeOneCard(ArrayList<Integer> fdeck, ArrayList<Integer> fplayer) {
        // взять карту из колоды
        int card = fdeck.get(fdeck.size() - 1);
        fdeck.remove(fdeck.size() - 1);
        // удалить карту из колоды
        fplayer.add(card);
        // выдать сколько у игрока очков
    }

    static int calcScore(ArrayList<Integer> fplayer) {
        int sum = 0;
        for (int i = 0; i < fplayer.size(); i++) {
            sum += fplayer.get(i);
        }
        return sum;
    }

    static void dealerTakeOneCard(ArrayList<Integer> fdeck, ArrayList<Integer> fdealer) {
        int card = fdeck.get(fdeck.size() - 1);
        fdeck.remove(fdeck.size() - 1);
        fdealer.add(card);
    }

    public static void main(String[] args) {

        // создаем новую колоду
        final int deckSize = 52;
        ArrayList<Integer> deck = new ArrayList<>();
        createDeck(deck);
        // перетасовать колду
        shuffleDeck(deck);
        // создать игрока
        ArrayList<Integer> player = new ArrayList<>();
        //  создать дилера
        ArrayList<Integer> dealer = new ArrayList<>();
        // действия игрока
        playerTurn(deck, player);
        // проверка результатов действий игрока
        //  1. игрок набрал 21, игра заканчивается, игрок выиграл.
        if (calcScore(player) == 21) {
            System.out.println("Игрок выиграл. Конец игры.");
            return;
        }
        //  2. игрок набрал больше 21, игра заканчивается, игрок проиграл
        if (calcScore(player) > 21) {
            System.out.println("Игрок проиграл. Конец игры.");
            return;
        }
        //  3. меньше 21 очка, игрок сказал "хватит"
        //  == действия дилера
        // 1. дилер набрал 21 (у игрока заведомо <21), игра заканчивается, дилер выиграл.
        if (calcScore(dealer) == 21) {
            System.out.println("Дилер Выиграл.");
            return;
        }
        //  2. дилер набрал больше 21, игра заканчивается, дилер проиграл
        if (calcScore(dealer) > 21) {
            System.out.println("Дилер проиграл.");
            return;
        }
        //  3. дилер набрал меньше 21 очка
        //  3.1 у игрока больше очков, чем у дилера - выиграл игрок
        //  3.2 у дилера больше очков, чем у игрока - выиграл дилер
        // 3.3 у обоих поровну очков - ничь.


    }// main
}


