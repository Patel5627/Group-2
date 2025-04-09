/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;



/**
 * @author Yash Patel
 */
public class BlackjackDeck extends GroupOfCards {
    public BlackjackDeck() {
        super(52);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new BlackjackCard(ranks[i], suit, values[i]));
            }
        }
        shuffle();
    }

    public BlackjackCard drawCard() {
        return (BlackjackCard) cards.remove(0);
    }
}