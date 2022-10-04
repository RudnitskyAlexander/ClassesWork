package Lesson_20_OOP_BlacJack;

import sun.plugin2.main.client.PluginEmbeddedFrame;


import java.util.Scanner;

public class Game {
    private Deck deck;
    private Player player;
    private Dealer dealer;
    private int playerWin;
    private int dealerWin;
    private int draws;

    public Game() {
        deck = new Deck();
        player = new Player();
        dealer = new Dealer();
        playerWin = 0;
        dealerWin = 0;
        draws = 0;
    }

    public void play() throws InterruptedException {

        Scanner in = new Scanner(System.in);
        char answer = 'y';

        while (answer == 'Y') {

            deck = new Deck();
            player = new Player();
            dealer = new Dealer();

            player.play(deck);


            if (player.calcScore() == 21) {
                System.out.println("Player win!");
                playerWin++;
                continue;
            } else if (player.calcScore() > 21) {
                System.out.println("Player lose!");
                dealerWin++;
                continue;
            }

            Dealer dealer = new Dealer();
            dealer.play(deck);

            if (dealer.calcScore() == 21) {
                System.out.println("Dealer win!");
                dealerWin++;
            } else if (dealer.calcScore() > 21) {
                System.out.println("Dealer lose!");
                playerWin++;
            } else if (player.calcScore() > dealer.calcScore()) {
                System.out.println("Player win!");
                playerWin++;
            } else if (player.calcScore() == dealer.calcScore()) {
                System.out.println("Draw!");
                draws++;
            }
            System.out.println("Player won : " + playerWin);
            System.out.println("Dealer won : " + dealerWin);
            System.out.println("Player won : " + draws);
            System.out.println("Do you want play the game? (type Y for continue, N for stop)");
            answer = in.nextLine().charAt(0);
        }
    }

}
