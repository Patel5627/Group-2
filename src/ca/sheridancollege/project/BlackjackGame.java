/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * Implements the game logic for Blackjack.
 */
public class BlackjackGame extends Game {
    private BlackjackDeck deck;
    private BlackjackPlayer player;
    private BlackjackPlayer dealer;

    public BlackjackGame(String name) {
        super(name);
        deck = new BlackjackDeck();
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        player = new BlackjackPlayer("Player");
        dealer = new BlackjackPlayer("Dealer");

        // Initial two cards for both players
        player.addCard(deck.drawCard());
        player.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());

        // Show initial hands
        player.showHand();
        System.out.println("Dealer's first card: " + dealer.getScore());

        // Player's turn
        while (player.getScore() < 21) {
            System.out.print("Hit or Stand? (h/s): ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("h")) {
                player.addCard(deck.drawCard());
                player.showHand();
            } else {
                break;
            }
        }

        // Dealer's turn
        while (dealer.getScore() < 17) {
            dealer.addCard(deck.drawCard());
        }
        dealer.showHand();

        // Determine the winner
        declareWinner();
    }

    @Override
    public void play() {
        startGame();
    }

    @Override
    public void declareWinner() {
        if (player.getScore() > 21) {
            System.out.println("Player busts! Dealer wins.");
        } else if (dealer.getScore() > 21 || player.getScore() > dealer.getScore()) {
            System.out.println("Player wins!");
        } else if (player.getScore() < dealer.getScore()) {
            System.out.println("Dealer wins.");
        } else {
            System.out.println("It's a tie!");
        }
    }
}

